package com.xhh.thread_juc.chapter01.semaphore_1;


/**
 * @author PengHui
 */
public class ThreadA extends Thread{

    private SemaphoreService semaphoreService;

    public ThreadA(SemaphoreService semaphoreService){
        super();
        this.semaphoreService = semaphoreService;
    }

    @Override
    public void run() {
        semaphoreService.testMethod();
    }
}
