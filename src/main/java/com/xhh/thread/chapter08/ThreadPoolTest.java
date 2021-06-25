package com.xhh.thread.chapter08;

import com.sun.media.sound.SoftTuning;

import java.util.concurrent.TimeUnit;

/**
 * 模拟线程池
 */
public class ThreadPoolTest {

    public static void main(String[] args) throws InterruptedException {
        // 定义线程池
        final BasicThreadPool threadPool = new BasicThreadPool(2, 6, 4, 1000);

        for (int i = 1; i < 200; i++) {
            threadPool.execute(() -> {
                try {
                    TimeUnit.SECONDS.sleep(10);
                    System.out.println(Thread.currentThread().getName() + " is running and done.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            for (; ; ) {
                // 不断输出线程池信息
                System.out.println("getActiveCount: " + threadPool.getActiveCount());
                System.out.println("getCoreSize: " + threadPool.getCoreSize());
                System.out.println("getQueueSize: " + threadPool.getQueueSize());
                System.out.println("getMaxSize: " + threadPool.getMaxSize());
                System.out.println("======================================================");
                TimeUnit.SECONDS.sleep(5);
            }

        }
    }
}
