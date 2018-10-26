package laiOffer.class3_Queue_Stack_LinkedList;

import laiOffer.ListNode;

import java.util.List;

public class LinkedListHasACycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
         /*
         10-14行也可以写成
         ListNode fast = head;
         ListNode slow = head;
         while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) brake;
        }
          */

        }
        if (fast == slow) return true;
        else {
            return false;
        }
    }
}
