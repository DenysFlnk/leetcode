/*
 * Convert to set and check every number from 1 to n.
 *
 * Time: O(n)
 * Memory: O(n)
 * */

class Solution1 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        if (nums.length == 1) {
            if (nums[0] == 1) {
                return result;
            } else {
                result.add(1);
                return result;
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            set.add(num);
        }

        int missingNumber = 1;
        while (missingNumber <= nums.length) {
            if (!set.contains(missingNumber)) {
                result.add(missingNumber);
            }
            missingNumber++;
        }

        return result;
    }
}