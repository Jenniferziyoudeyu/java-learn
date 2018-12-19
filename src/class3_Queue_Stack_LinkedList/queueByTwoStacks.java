package class3_Queue_Stack_LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

/**
 * Description
 * Java: Implement a queue by using two stacks. The queue should provide size(), isEmpty(), offer(), poll() and peek() operations. When the queue is empty, poll() and peek() should return null.
 *
 * Assumptions
 *
 * The elements in the queue are all Integers.
 * size() should return the number of elements buffered in the queue.
 * isEmpty() should return true if there is no element buffered in the queue, false otherwise.
 * 。
 */
/*
这道题的关键点 在pop和peek步骤，在于pushAllToStack2的条件，在于Stack2为空的时候。 这是关键点。
 */

public class queueByTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public queueByTwoStacks() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public Integer poll() {
        pushAllToStack2();
        return stack2.isEmpty() ? null : stack2.pop();
    }


    public void offer(int element) {
        stack1.push(element);

    }

    public Integer peek() {
        pushAllToStack2();
        return stack2.isEmpty() ? null : stack2.peek();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return (stack1.isEmpty()&&stack2.isEmpty());
    }

    private void pushAllToStack2() {
//        stack2是否为空只需要判断一次，而push要进行多次操作，所以判断一次用if，判断多次用while
        if (stack2.isEmpty()){
            //注意下面不能写成stack1 == null。stack为空和null是两码事
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

}



