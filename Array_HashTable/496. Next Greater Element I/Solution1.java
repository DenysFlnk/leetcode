/*
 * Create map with indices of nums2. Check in loop from known index if there is greater element.
 *
 * Time: O(n x m)
 * Memory: O(n + m)
 * */

class Solution1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return nums1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int value = nums1[i];

            for (int j = map.get(value); j < nums2.length; j++) {
                if (nums2[j] > value) {
                    ans[i] = nums2[j];
                    break;
                }
            }

            if(ans[i] == 0) {
                ans[i] = -1;
            }
        }

        return ans;
    }
}