package class3_Queue_Stack_LinkedList;


/**
 * Description
 * Find the middle node of a given linked list.
 *
 * Examples
 *
 * L = null, return null
 * L = 1 -> null, return 1
 * L = 1 -> 2 -> null, return 1
 * L = 1 -> 2 -> 3 -> null, return 2
 * L = 1 -> 2 -> 3 -> 4 -> null, return 2
 *
 */

public class middleNodeOfLinkedList {
    public ListNode middleNode(ListNode head) {
        if (head == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        //fast != null && fast.next != null 保证fast.next.next不越界
        //fast.next.next != null保证双数个的时候，返回是双数个前面一个数（eg 1234 返回2 而不是3）
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next; //不能写成fast = head.next.next;如果写成 就是死循环
            slow = slow.next;
        }
        return slow;
    }
}
