package com.xhh.thread_juc.chapter01.semaphore_1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreService {

    private Semaphore semaphore = new Semaphore(1);

    public void testMethod(){
        try {
            semaphore.acquire();

            System.out.println(Thread.currentThread().getName() + " Begin At: "+ System.currentTimeMillis());
            TimeUnit.SECONDS.sleep(5);
            System.out.println(Thread.currentThread().getName() + " End At: "+ System.currentTimeMillis());

            semaphore.release();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
