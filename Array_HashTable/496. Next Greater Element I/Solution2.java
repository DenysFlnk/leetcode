/*
 * In loop push nums2 elements to stack and check if current element is bigger than element on the top of stack,
 * if so - put in map and pop from stack.
 *
 * Time: O(n + m)
 * Memory: O(n + m)
 * */

class Solution2 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return nums1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(Integer num : nums2) {
            while (!stack.empty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]) != null ? map.get(nums1[i]) : -1;
        }


        return ans;
    }
}