package com.xhh.thread.chapter01;

/**
 * 通过继承Thread，模拟窗口活动
 */
public class TicketWindowByT extends Thread {

    private static int index = 1;

    /**
     * 窗口名称
     */
    private final String name;

    /**
     * 500笔业务
     */
    private static final int MAX_NUM = 500;

    public TicketWindowByT(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while(index <= MAX_NUM){
            System.out.println("窗口："+ name +"，当前处理号码是："+ index++);
        }
    }

    public static void main(String[] args) {

        System.out.println("上午10点，银行开始办理业务了");

        TicketWindowByT window1 = new TicketWindowByT("窗口①");
        window1.start();
        TicketWindowByT window2 = new TicketWindowByT("窗口②");
        window2.start();
        TicketWindowByT window3 = new TicketWindowByT("窗口③");
        window3.start();
        TicketWindowByT window4 = new TicketWindowByT("窗口④");
        window4.start();

        System.out.println("下午5点，银行结束办理业务了");
    }

}
