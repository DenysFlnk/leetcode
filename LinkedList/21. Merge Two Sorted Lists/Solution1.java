/*
 * Use recurtion, check which one is smaller and start recurtion from next node to link all list.
 *
 * Time: O(n)
 * Memory: O(n) - cause of stack of method calls
 * */
class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}