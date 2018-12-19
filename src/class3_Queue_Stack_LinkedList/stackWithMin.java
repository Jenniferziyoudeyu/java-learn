package class3_Queue_Stack_LinkedList;

import java.util.Stack;
/**
 * Description
 * Enhance the stack implementation to support min() operation. min() should return the current
 minimum value in the stack. If the stack is empty, min() should return -1.
 *
 * pop() - remove and return the top element, if the stack is empty, return -1
 *
 * push(int element) - push the element to top
 * top() - return the top element without remove it, if the stack is empty, return -1
 * min() - return the current min value in the stack.
 */

public class stackWithMin {
    //在外面声明，在constructor里面初始化,初始化的两个stack都不是null
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public stackWithMin() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public int pop() {
        if (stack1.isEmpty()) return -1;
        else if (!stack2.isEmpty() && stack1.peek().equals(stack2.peek())) {
            stack2.pop();
        }
        return stack1.pop();
    }

    public void push(int element) {
        //stack1每次push，当新element《= Stack Overflow
        //第二行，push第一个数的时候stack2里面没有数，不能peek。所以要写条件 stack2也是空的时候
        stack1.push(element);
        if (stack2.isEmpty() || element <= stack2.peek() ) {
            stack2.push(element);
        }

    }

    public int top() {
        if (stack1.isEmpty()) return -1;
        return stack1.peek();
    }

    public int min() {
        //最小值是stack2第一个数，不用管stack1，也不用pop出来。只需要看一下最小值是几就可以
        if (stack2.isEmpty()) return -1;
        return stack2.peek();
    }

}
