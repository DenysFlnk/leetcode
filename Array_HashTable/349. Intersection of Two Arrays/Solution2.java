
/*
 * Convert each array to set and find intersections between them.
 *
 * Due to set.contains(*) is O(1) operation:
 * Time: O(n + m)
 * Memory: O(n + m)
 * */
class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        HashSet<Integer> hashSet1 = createHashSet(nums1);
        HashSet<Integer> hashSet2 = createHashSet(nums2);

        HashSet<Integer> intersection = new HashSet<>();

        if (hashSet1.size() < hashSet2.size()) {
            findInteresction(hashSet1, hashSet2, intersection);
        } else {
            findInteresction(hashSet2, hashSet1, intersection);
        }


        int[] result = intersection.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    private void findInteresction(HashSet<Integer> set1, HashSet<Integer> set2, HashSet<Integer> intersection) {
        for (Integer num : set1) {
            if (set2.contains(num)) {
                intersection.add(num);
            }
        }
    }

    private HashSet<Integer> createHashSet(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hashSet.add(nums[i]);
        }
        return hashSet;
    }
}