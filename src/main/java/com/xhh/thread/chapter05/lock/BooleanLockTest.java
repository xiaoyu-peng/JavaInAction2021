package com.xhh.thread.chapter05.lock;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.IntStream;

public class BooleanLockTest {

    private final Lock lock = new BooleanLock();

    public void syncMethod() {
        try {
            lock.lock();
            Random random = new Random();
            int randomInt = random.nextInt(10);
            System.out.println(Thread.currentThread() + " get the lock.");
            TimeUnit.SECONDS.sleep(randomInt);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unLock();
        }
    }

    public void syncMethodTimeout() {

        // try..finally语句块，确保lock每次都能被正确释放
        try {
            // 加锁
            lock.lock(1000);
            System.out.println(Thread.currentThread() + " get the lock.");
            Random random = new Random();
            int randomInt = random.nextInt(10);
            TimeUnit.SECONDS.sleep(randomInt);
        } catch (InterruptedException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unLock();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        BooleanLockTest blt = new BooleanLockTest();
        //定义一个线程并启动
        IntStream.range(0, 10).mapToObj(i -> new Thread(blt::syncMethod)).forEach(Thread::start);

        new Thread(blt::syncMethod, "T1").start();

        TimeUnit.MILLISECONDS.sleep(2);

        new Thread(blt::syncMethodTimeout, "T2").start();

        TimeUnit.MILLISECONDS.sleep(10);
    }


}
