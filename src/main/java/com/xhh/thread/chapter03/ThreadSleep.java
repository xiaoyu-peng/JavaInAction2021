package com.xhh.thread.chapter03;

/**
 * Thread.sleep 只会导致当前线程进入指定时间的修复
 *
 * Thread-0 耗时为：2009
 * main 耗时为：3006
 *
 */
public class ThreadSleep {

    public static void main(String[] args) throws InterruptedException {

        new Thread( () -> {
            long beginTime = System.currentTimeMillis();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long endTime = System.currentTimeMillis();

            System.out.println(Thread.currentThread().getName() +" 耗时为："+ (endTime-beginTime));
        }).start();

        long begin = System.currentTimeMillis();
        Thread.sleep(3000);
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() +" 耗时为："+ (end-begin));

    }
}
