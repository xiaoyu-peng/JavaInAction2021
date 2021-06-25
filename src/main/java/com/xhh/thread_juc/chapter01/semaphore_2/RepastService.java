package com.xhh.thread_juc.chapter01.semaphore_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用semaphore模拟多生产者、多消费者
 *
 * TODO semaphore 提供了限制并发线程数的功能
 */
public class RepastService {

    volatile private Semaphore setSemaphore = new Semaphore(10);
    volatile private Semaphore getSemaphore = new Semaphore(20);

    volatile private ReentrantLock lock = new ReentrantLock();
    volatile private Condition setCondition = lock.newCondition();
    volatile private Condition getCondition = lock.newCondition();

    // 最多只有4个盒子存放菜品
    volatile private Object[] producePosition = new Object[4];

    private boolean isEmpty() {
        boolean isEmpty = true;
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] != null) {
                isEmpty = false;
                break;
            }
        }

        if (isEmpty) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isFull() {
        boolean isFull = true;
        for (int i = 0; i < producePosition.length; i++) {
            if (producePosition[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    public void set() {
        try {
            setSemaphore.acquire(); // 允许同时最多有10个厨师进行生成
            lock.lock();
            while (isFull()) {
                System.out.println("生产者等待");
                setCondition.await();
            }

            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] == null) {
                    producePosition[i] = "盘中餐" + Math.random();
                    System.out.println(Thread.currentThread().getName() + "生产了" + producePosition[i]);
                    break;
                }
            }
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setSemaphore.release();
        }
    }


    public void get() {
        try {
            getSemaphore.acquire(); // 允许同时最多有20个消费者
            lock.lock();
            while (isEmpty()) {
                System.out.println("消费者等待");
                getCondition.await();
            }

            for (int i = 0; i < producePosition.length; i++) {
                if (producePosition[i] != null) {
                    System.out.println(Thread.currentThread().getName() + "消费了" + producePosition[i]);
                    producePosition[i] = null;
                    break;
                }
            }
            setCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }

}
