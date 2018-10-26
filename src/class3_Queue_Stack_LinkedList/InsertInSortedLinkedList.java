package class3_Queue_Stack_LinkedList;

/**
 *
 Description
 Insert a value in a sorted linked list.

 Examples

 L = null, insert 1, return 1 -> null
 L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
 L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
 L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null

 */
/*
  public ListNode insert(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        ListNode pre = null, cur = head;
        while (cur != null && cur.value < value) {
            pre = cur;
            cur = cur.next;
        }
        newNode.next = cur;
        if (pre == null) return newNode;
        else pre.next = newNode;
        return head;
    }
 */
public class InsertInSortedLinkedList {
    public ListNode insert(ListNode head, int value) {
        if (head == null) return new ListNode(value);
        ListNode res = head;
        ListNode prev = null;
        while (head != null && head.value < value) {
            prev = head;
            head = head.next;
        }
        ListNode insertNode = new ListNode(value);
        if (prev == null) {
            insertNode.next = res;
            return insertNode;
        }
        prev.next = insertNode;
        insertNode.next = head;
        return res;
    }


    public ListNode insert2(ListNode head, int value) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        while (head != null && head.value < value) {
            pre = head;
            head = head.next;
        }
        ListNode newNode = new ListNode(value);

        pre.next = newNode;
        newNode.next = head;
        return dummy.next;
    }

}
