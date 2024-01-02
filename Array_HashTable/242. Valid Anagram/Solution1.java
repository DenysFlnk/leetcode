/*
 * Count occurances of each letter and add it to hashmap.
 * Subtract occurances from another string.
 *
 * Time: O(n)
 * Memory: O(n)
 * */
class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.compute(s.charAt(i), (key, value) -> value + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) == 0) {
                return false;
            } else {
                map.compute(t.charAt(i), (key, value) -> value - 1);
            }
        }

        for (Integer value : map.values()) {
            if (value != 0) {
                return false;
            }
        }

        return true;
    }
}