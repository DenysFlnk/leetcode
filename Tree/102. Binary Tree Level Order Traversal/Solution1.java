/*
 * Use queue, offer root node and start while loop.
 * On each lap check size and start fori < size to add nodes to temp list and offer nodes to queue.
 * After fori add temp to result list.
 *
 * Time: O(n)
 * Memory: O(n)
 * */
class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    level.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
            if (!level.isEmpty()) {
                result.add(level);
            }
        }

        return result;
    }
}