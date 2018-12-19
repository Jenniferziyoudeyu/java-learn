package class3_Queue_Stack_LinkedList;

import sun.awt.SunHints;

import java.util.Queue;

/**
 * Given a queue of integers, find the maximum number in it.
 *
 * Assumption: the queue is not null or empty.
 *
 * Example:
 * Queue contains 5,8,3,2,7
 * Answer: 8.
 */

public class MaxInQueue {
    public int maxInQueue(Queue<Integer> queue) {
        //要先判断queue是否为null，再判断是否为空
        if (queue == null || queue.isEmpty()) return Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        //要和每个数比较完再返回
        while(!queue.isEmpty()) {
            res = Math.max(queue.poll(),res);
        }
        return res;

    }

}
