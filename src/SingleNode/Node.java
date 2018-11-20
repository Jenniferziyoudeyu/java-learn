package SingleNode;

import java.util.ArrayList;
import java.util.List;

public class Node {
    SingleNode lastNode (SingleNode head) {
        while (head != null && head.next != null) {
            head = head.next;
        }
        return head;
    }

    SingleNode last2Node (SingleNode head) {
        while (head != null && head.next != null && head.next.next != null) {
            head= head.next;
        }
        return head;
    }

    SingleNode deleteLast2Node (SingleNode head) {
        SingleNode last2 = last2Node(head);
        if (last2 == null || last2.next == null) return null;
        last2.next = null;
        return head;
    }

    SingleNode delete1stNode (SingleNode head) {
        if (head == null || head.next ==null) return null;
        head.next = head.next.next;
        return head;
    }

    SingleNode deleteSecHalf (SingleNode head) {
        SingleNode res = head;
        List<SingleNode> list = new ArrayList<>();
        while (head != null) {
            list.add(head);
        }
        int size = list.size();
        if(size < 2) return res;
        SingleNode mid = size % 2 == 0 ? list.get (size/2 - 1): list.get(size / 2);
        mid.next = null;
        return head;

    }


}
































