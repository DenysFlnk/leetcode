/*
 * Convert bigger array to set and find intersections between it and array.
 *
 * Due to set.contains(*) is O(1) operation:
 * Time: O(n + m)
 * Memory: O(n)
 * */
class Solution1 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        return nums1.length < nums2.length ? findIntersection(nums2, nums1) : findIntersection(nums1, nums2);
    }

    private int[] findIntersection(int[] bigger, int[] smaller) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = createHashMap(bigger);
        for (Integer num : smaller) {
            Integer value = map.get(num);
            if (value != null && value != 0) {
                result.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private HashMap<Integer, Integer> createHashMap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        return map;
    }
}