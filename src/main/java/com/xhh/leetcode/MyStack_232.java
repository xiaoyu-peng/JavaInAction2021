package com.xhh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack_232 {

    Queue<Integer> tmp_queue;
    Queue<Integer> _queue;

    /**
     * Initialize your data structure here.
     */
    public MyStack_232() {
        tmp_queue = new LinkedList<Integer>();
        _queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        tmp_queue.add(x);
        while (!_queue.isEmpty()) {
            tmp_queue.add(_queue.poll());
        }
        while (!tmp_queue.isEmpty()) {
            _queue.add(tmp_queue.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return _queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return _queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return _queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack_232 obj = new MyStack_232();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

        int param_5 = obj.pop();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println(param_5);

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)
