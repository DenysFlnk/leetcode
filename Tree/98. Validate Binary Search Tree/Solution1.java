/*
 * Recursively check if left subtree is less then root.val and right subtree is bigger then root.val
 *
 * Time: O(n)
 * Memory: O(n) - cause of stack of method calls
 * */
class Solution1 {
    public boolean isValidBST(TreeNode root) {
        return checkValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean checkValid(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return checkValid(node.left, min, Math.min(max, node.val)) &&
                checkValid(node.right, Math.max(min, node.val), max);
    }
}