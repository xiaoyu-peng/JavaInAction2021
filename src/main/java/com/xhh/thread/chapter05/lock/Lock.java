package com.xhh.thread.chapter05.lock;

import java.util.List;
import java.util.concurrent.TimeoutException;

public interface Lock {

    void lock() throws InterruptedException;

    void lock(long mils) throws InterruptedException, TimeoutException;

    void unLock();

    List<Thread> getBlockedThreads();
}
