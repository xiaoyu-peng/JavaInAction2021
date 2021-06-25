package com.xhh.thread_juc.chapter01.semaphore_2;

public class ThreadProducer extends Thread{

    private RepastService repastService;

    public ThreadProducer(RepastService repastService) {
        super();
        this.repastService = repastService;
    }

    @Override
    public void run() {
        repastService.set();
    }
}
