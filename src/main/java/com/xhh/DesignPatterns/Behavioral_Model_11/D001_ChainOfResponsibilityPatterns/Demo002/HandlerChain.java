package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns.Demo002;

/**
 * 第一种实现方式如下所示。其中，Handler 是所有处理器类的抽象父类，handle() 是抽象方法。
 *
 * 每个具体的处理器类（HandlerA、HandlerB）的 handle() 函数的代码结构类似，如果它能处理该请求，就不继续往下传递；
 * 如果不能处理，则交由后面的处理器来处理（也就是调用 successor.handle()）。
 *
 * HandlerChain 是处理器链，从数据结构的角度来看，它就是一个记录了链头、链尾的链表。其中，记录链尾是为了方便添加处理器。
 */
public class HandlerChain {

    /**
     * 链头
     */
    private Handler head = null;
    /**
     * 链尾
     */
    private Handler tail = null;

    public void addHandler(Handler handler) {
        handler.setSuccessor(null);
        if (head == null) {
            head = handler;
            tail = handler;
            return;
        }
        tail.setSuccessor(handler);
        tail = handler;
    }

    public void handle() {
        if (head != null) {
            head.handle();
        }
    }
}