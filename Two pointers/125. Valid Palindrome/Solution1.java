/*
 * Count occurances of each letter and add it to hashmap.
 * Subtract occurances from another string.
 *
 * Time: O(n)
 * Memory: O(n)
 * */
class Solution1 {
    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        if  (s.isEmpty()) {
            return true;
        }

        String formatted = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        if (formatted.isEmpty()) {
            return true;
        }

        int left = 0, right = formatted.length() - 1;

        while (left < right) {
            if (formatted.charAt(left) != formatted.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}