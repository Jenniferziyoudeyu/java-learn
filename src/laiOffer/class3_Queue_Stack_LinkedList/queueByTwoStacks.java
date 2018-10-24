package laiOffer.class3_Queue_Stack_LinkedList;

import java.util.Stack;

public class queueByTwoStacks {
    /**
     * Description
     * Java: Implement a queue by using two stacks. The queue should provide size(), isEmpty(), offer(), poll() and peek() operations. When the queue is empty, poll() and peek() should return null.
     *
     * Assumptions
     *
     * The elements in the queue are all Integers.
     * size() should return the number of elements buffered in the queue.
     * isEmpty() should return true if there is no element buffered in the queue, false otherwise.
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    public queueByTwoStacks() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public Integer poll() {
        pushAllToStack2();
        return stack2.isEmpty()? null:stack2.pop();
    }

    public void offer(int element) {
        stack1.push(element);
    }

    public Integer peek() {
        pushAllToStack2();
        return stack2.isEmpty()? null : stack2.pop();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    private void pushAllToStack2(){
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
