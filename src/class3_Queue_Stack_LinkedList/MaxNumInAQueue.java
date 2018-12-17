package class3_Queue_Stack_LinkedList;

import java.util.Queue;

public class MaxNumInAQueue {
    public int MaxInQueue (Queue<Integer> queue) {
//        if (queue == null) throw new NullPointerException();
        if (queue == null) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()) {
            max = Math.max(max, queue.poll());
        }
        return max;












//        for (int i = 0; i < 10; i ++) {
//
//        }
//        int m = 10;
//        int j = 0;
//        while (j < 10) {
//            if (m < 10) j++;
//            else if (m > 10) j--;
//        }
//
//        int i = 0;
//        while (i < 10) {
//            System.out.println();
//            System.out.println();
//        }

    }

}
