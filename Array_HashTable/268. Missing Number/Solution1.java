/*
 * Sort array and find missing number in loop by index.
 *
 * Time: O(nlog(n))
 * Memory: O(1)
 * */
class Solution1 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return n;
    }
}