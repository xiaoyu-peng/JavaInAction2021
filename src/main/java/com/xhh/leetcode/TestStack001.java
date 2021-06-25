package com.xhh.leetcode;

import java.util.Stack;

public class TestStack001 {

    public static void main(String[] args) {

        // 定义栈
        Stack stack = new Stack();

        if(stack.isEmpty()){
            System.out.println("stack is empty!");
        }

        stack.push(5);
        stack.push(6);
        stack.push(10);

        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());

    }
}
