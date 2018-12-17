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
    }

}
