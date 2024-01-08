/*
 * Initially remove head.next and recursively change links of each node.
 *
 * Time: O(n)
 * Memory: O(n) - cause of stack of method calls
 * */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head.next;
        head.next = null;

        return getReversedHead(head, temp);
    }

    private ListNode getReversedHead(ListNode node, ListNode next) {
        if (next.next == null) {
            next.next = node;
            return next;
        }

        ListNode temp = next.next;
        next.next = node;

        return getReversedHead(next, temp);
    }
}