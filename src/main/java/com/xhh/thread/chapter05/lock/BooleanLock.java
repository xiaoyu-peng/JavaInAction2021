package com.xhh.thread.chapter05.lock;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeoutException;

public class BooleanLock implements Lock {

    private Thread currentThread;

    private boolean locked = false;

    private final List<Thread> blockedList = new ArrayList<>();


    @Override
    public void lock() throws InterruptedException {
        synchronized (this) {
            Thread currentThread = Thread.currentThread();
            while (locked) {
                // 暂存当前线程
                final Thread tmpThread = Thread.currentThread();
                try {
                    if (!blockedList.contains(tmpThread)) {
                        blockedList.add(tmpThread);
                    }
                    this.wait();
                }catch (InterruptedException e){
                    // 如果当前线程在wait时被中断，则从blockedList中将其删除，避免内存泄漏
                    blockedList.remove(tmpThread);
                    // 继续抛出异常
                    throw e;
                }

            }
            blockedList.remove(currentThread);
            this.locked = true;
            this.currentThread = currentThread;

        }
    }

    @Override
    public void lock(long mils) throws InterruptedException, TimeoutException {
        synchronized (this) {
            if (mils <= 0) {
                this.lock();
            } else {
                long remainingMils = mils;
                Thread currentThread = Thread.currentThread();
                long endMils = System.currentTimeMillis() + remainingMils;
                while (locked) {
                    if (remainingMils <= 0) {
                        throw new TimeoutException("can not get the lock during " + mils);
                    }

                    if (!blockedList.contains(currentThread)) {
                        blockedList.add(currentThread);
                    }

                    this.wait(remainingMils);
                    remainingMils = endMils - System.currentTimeMillis();
                }

                blockedList.remove(currentThread);
                this.locked = true;
                this.currentThread = currentThread;
            }
        }
    }

    @Override
    public void unLock() {
        synchronized (this) {
            if (currentThread == Thread.currentThread()) {
                this.locked = false;
                Optional.of(Thread.currentThread().getName() + " release the lock").ifPresent(System.out::println);
                this.notifyAll();
            }
        }
    }

    @Override
    public List<Thread> getBlockedThreads() {
        return Collections.unmodifiableList(blockedList);
    }

}
