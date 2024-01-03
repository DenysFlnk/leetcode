/*
 * Use stack to push when open bracket and pop when opposite.
 *
 * Time: O(n)
 * Memory: O(n)
 * */
class Solution1 {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch.equals('{')) {
                stack.push('}');
            } else if (ch.equals('[')) {
                stack.push(']');
            } else if (ch.equals('(')) {
                stack.push(')');
            } else if (stack.empty() || !stack.pop().equals(ch)) {
                return false;
            }
        }

        return stack.empty();
    }
}