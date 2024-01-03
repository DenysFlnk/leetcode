/*
 * Recursively count depth of right and left subtree, choose max.
 *
 * Time: O(n)
 * Memory: O(n) - cause of stack of method calls
 * */
class Solution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}