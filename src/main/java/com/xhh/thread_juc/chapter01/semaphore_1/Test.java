package com.xhh.thread_juc.chapter01.semaphore_1;

public class Test {

    public static void main(String[] args) {

        SemaphoreService semaphoreService = new SemaphoreService();
        ThreadA threadA = new ThreadA(semaphoreService);
        threadA.setName("THREAD_A");
        threadA.start();

        ThreadB threadB = new ThreadB(semaphoreService);
        threadB.setName("THREAD_B");
        threadB.start();

        ThreadC threadC = new ThreadC(semaphoreService);
        threadC.setName("THREAD_C");
        threadC.start();
    }
}
