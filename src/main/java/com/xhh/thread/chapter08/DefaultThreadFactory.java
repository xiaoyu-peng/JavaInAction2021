package com.xhh.thread.chapter08;

import java.util.concurrent.atomic.AtomicInteger;

public class DefaultThreadFactory implements ThreadFactory{

    private static final AtomicInteger GROUP_COUNTER = new AtomicInteger(1);

    private static final ThreadGroup group = new ThreadGroup("MyThreadPool-"+ GROUP_COUNTER.getAndDecrement());

    private static final AtomicInteger COUNTER = new AtomicInteger(0);

    @Override
    public Thread currentThread(Runnable runnable) {
        return new Thread(group, runnable, "thread-pool_"+ GROUP_COUNTER.getAndDecrement());
    }
}
