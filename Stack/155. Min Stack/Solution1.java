/*
 * Don`t push actual value but 2L * val - this.min (old min) and update min with actual value.
 * When popping check if top value is less then min if so - update min with old value by this.min * 2 - top.
 *
 * Time: O(1)
 * Memory: O(n)
 * */
public class Solution1 {
    class MinStack {

        Stack<Long> stack = new Stack<>();

        long min;

        public MinStack() {

        }

        public void push(int val) {
            if (this.stack.isEmpty()) {
                this.stack.push((long) val);
                this.min = val;
                return;
            }

            if (val < this.min) {
                long pushVal = 2L * val - this.min;
                this.stack.push(pushVal);
                this.min = val;
            } else {
                this.stack.push((long) val);
            }
        }

        public void pop() {
            long top = this.stack.pop();

            if (top < this.min) {
                this.min = this.min * 2 - top;
            }
        }

        public int top() {
            if (this.stack.peek() < this.min) {
                return (int) this.min;
            }
            return this.stack.peek().intValue();
        }

        public int getMin() {
            return (int) this.min;
        }
    }
}