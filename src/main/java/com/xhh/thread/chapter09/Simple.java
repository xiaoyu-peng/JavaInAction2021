package com.xhh.thread.chapter09;

import sun.java2d.pipe.SpanShapeRenderer;

public class Simple extends SimpleParent{

    public static int x = 50;

    static{
        System.out.println("I will be initialized");
    }

    // 静态方法
    public static void test(){
        System.out.println("静态方法");
    }

}
