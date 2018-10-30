package class3_Queue_Stack_LinkedList;

public class PartitionLinkedList {
    public ListNode partition(ListNode head, int target) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0),
                res = dummy;
        ListNode dummy2 = new ListNode(0),
                dummy2Copy = dummy2;
        while (head != null) {
            if (head.value < target) {
                dummy.next = head;
                dummy = dummy.next;
            }
            if (head.value >= target) {
                dummy2.next = head;
                dummy2 = dummy2.next;
            }
            head = head.next;
        }
        dummy2.next = null;
        dummy.next = dummy2Copy.next;
        return res.next;
    }

}