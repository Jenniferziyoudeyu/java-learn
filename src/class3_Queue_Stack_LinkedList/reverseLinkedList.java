package class3_Queue_Stack_LinkedList;

import ListNode;

/**
 * Description
 * Reverse a singly-linked list.
 *
 * Examples
 *
 * L = null, return null
 * L = 1 -> null, return 1 -> null
 * L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
 */
public class reverseLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return head;
        }
        //设置prev指针
        ListNode prev = null;
        //三步走，保存下一个头next，指针反转，平移。head走到最后指针的next停下
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev; // head指针走到最后一个数的next停下，反转后的头是prev
    }



}
