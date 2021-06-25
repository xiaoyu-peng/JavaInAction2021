package com.xhh.thread.chapter04;

import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 对象锁和类锁
 *
 * 1. 对象锁
 * 在 Java 中，每个对象都会有一个 monitor 对象，这个对象其实就是 Java 对象的锁，通常会被称为“内置锁”或“对象锁”。
 * TODO 类的对象可以有多个，所以每个对象有其独立的对象锁，互不干扰。
 *
 * 2. 类锁
 * 在 Java 中，针对每个类也有一个锁，可以称为“类锁”，类锁实际上是通过对象锁实现的，即类的 Class 对象锁。
 * TODO 每个类只有一个 Class 对象，所以每个类只有一个类锁。
 */
public class SynchronizedTest {

    private final Object mutex = new Object();

    public void accessResource() {
        synchronized (mutex) {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("======");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        IntStream.range(1, 5).forEach( i -> {
                new Thread(synchronizedTest::accessResource).start();
        });
    }
}
