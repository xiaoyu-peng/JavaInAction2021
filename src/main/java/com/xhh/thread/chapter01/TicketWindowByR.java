package com.xhh.thread.chapter01;

import java.util.concurrent.TimeUnit;

/**
 * 实现Runnable接口，模拟窗口叫号
 * @author PengHui
 */
public class TicketWindowByR implements Runnable{

    private int index = 1;

    private static final int MAX_NUM = 50;

    @Override
    public void run() {
        while(index <= MAX_NUM){
            System.out.println("窗口："+ Thread.currentThread().getName() +"，当前处理号码是："+ index++);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
       final TicketWindowByR ticketWindowByR = new TicketWindowByR();
        Thread t1 = new Thread(ticketWindowByR, "窗口①");
        t1.start();
        Thread t2 = new Thread(ticketWindowByR, "窗口②");
        t2.start();
        Thread t3 = new Thread(ticketWindowByR, "窗口③");
        t3.start();
        Thread t4 = new Thread(ticketWindowByR, "窗口④");
        t4.start();
    }
}
