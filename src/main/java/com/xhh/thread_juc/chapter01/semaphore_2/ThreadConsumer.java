package com.xhh.thread_juc.chapter01.semaphore_2;

public class ThreadConsumer extends Thread{

    private RepastService repastService;

    public ThreadConsumer(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.get();
    }
}
