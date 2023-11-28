/*
* "Brute force", comparing every element in one array to another.
* Add intersections to set to avoid duplicates.
*
* Time: O(n x m)
* Memory: O(n) or O(m)
* */
class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    break;
                }
            }
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (Integer num : set) {
            result[index] = num;
            index++;
        }

        return result;
    }
}