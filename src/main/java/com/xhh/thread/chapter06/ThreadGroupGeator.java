package com.xhh.thread.chapter06;

import java.util.concurrent.TimeUnit;

public class ThreadGroupGeator {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();

        ThreadGroup group1 = new ThreadGroup("Group1");
        System.out.println(group1.getParent() == threadGroup);

        ThreadGroup group2 = new ThreadGroup(group1, "Group2");
        System.out.println(group2.getParent() == group1);
        group1.setMaxPriority(3);

        new Thread(group2, () -> {
            System.out.println(Thread.currentThread().getName() + " ---->");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread() +"被"+ Thread.currentThread().getThreadGroup() +"打断了");
            }
        }, "T1").start();

        new Thread(group2, () -> {
            System.out.println(Thread.currentThread().getName() + " ---->");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(Thread.currentThread() +"被"+ Thread.currentThread().getThreadGroup() +"打断了");
            }
        }, "T2").start();

        // list() 该方法没有返回值，执行该方法 会将 group中的所有活跃的线程信息 全部输出到控制台。相当于 System.out
        group2.list();
        //group2.interrupt();

        group2.destroy();

        TimeUnit.SECONDS.sleep(3);
        group2.list();
    }
}
