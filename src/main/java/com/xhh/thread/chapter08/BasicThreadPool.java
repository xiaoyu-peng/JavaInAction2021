package com.xhh.thread.chapter08;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class BasicThreadPool extends Thread implements ThreadPool {

    // 初始化线程数量
    private final int initSize;

    // 线程池最大线程数量
    private final int maxSize;

    // 线程池核心线程数量
    private final int coreSize;

    // 当前活跃的线程数量
    private int activeCount;


    /**
     * 创建线程所需的工厂
     */
    private final ThreadFactory threadFactory;

    /**
     * 任务队列
     */
    private final RunnableQueue runnableQueue;

    /**
     * 线程池是否已经被shutdown
     */
    private volatile boolean isShutDown = false;

    /**
     * 工作线程队列
     */
    private final Queue<ThreadTask> threadQueue = new ArrayDeque<>();

    private final static DenyPolicy DEFAULT_DENY_POLICY = new DenyPolicy.DiscardDenyPolicy();

    private final static ThreadFactory DEFAULT_THREAD_FACTORY = new DefaultThreadFactory();

    private final long keepAliveTime;

    private final TimeUnit timeUnit;

    public BasicThreadPool(int initSize, int maxSize, int coreSize, int queueSize) {
        this(initSize, maxSize, coreSize, DEFAULT_THREAD_FACTORY, queueSize, DEFAULT_DENY_POLICY, 10, TimeUnit.SECONDS);
    }

    public BasicThreadPool(int initSize, int maxSize, int coreSize, ThreadFactory threadFactory, int queueSize, DenyPolicy denyPolicy, long keepAliveTime, TimeUnit timeUnit) {
        this.initSize = initSize;
        this.maxSize = maxSize;
        this.coreSize = coreSize;
        this.threadFactory = threadFactory;
        this.runnableQueue = new LinkedRunnableQueue(queueSize, denyPolicy, this);
        this.keepAliveTime = keepAliveTime;
        this.timeUnit = timeUnit;
        this.init();
    }

    // 初始化时，先创建initSize个线程
    private void init() {
        start();
        for (int i = 0; i < initSize; i++) {
            newThread();
        }
    }

    /**
     * 创建任务线程，并启动
     */
    private void newThread() {
        InternalTask internalTask = new InternalTask(runnableQueue);
        Thread thread = this.threadFactory.currentThread(internalTask);
        ThreadTask threadTask = new ThreadTask(thread, internalTask);
        threadQueue.offer(threadTask);
        this.activeCount++;
        thread.start();
    }

    /**
     * 从线程池中移除某个线程
     */
    private void removeThread() {
        ThreadTask threadTask = threadQueue.remove();
        threadTask.internalTask.stop();
        this.activeCount--;
    }

    /**
     * TODO ****维护线程池中的线程数量**** 比如 扩容、回收等工作
     */
    @Override
    public void run() {
        while (!isShutDown && !isInterrupted()) {
            try {
                timeUnit.sleep(keepAliveTime);
            } catch (InterruptedException e) {
                isShutDown = true;
                break;
            }

            synchronized (this) {
                if (isShutDown) {
                    break;
                }

                // TODO 1) 当前队列中的任务尚未处理，并且 activeCount < coreSize 则继续扩容
                if (runnableQueue.size() > 0 && activeCount < coreSize) {
                    for (int i = initSize; i < coreSize; i++) {
                        newThread();
                    }
                    // continue 的目的 不想让线程的扩容直接达到maxSize
                    continue;
                }

                // TODO 2) 当前队列中有任务尚未处理，并且 activeCount < maxSize 则继续扩容
                if (runnableQueue.size() > 0 && activeCount < maxSize) {
                    for (int i = coreSize; i < maxSize; i++) {
                        newThread();
                    }
                }

                // TODO 3) 如果任务队列中没有任务，则需要回收，回收至 coreSize 即可
                if (runnableQueue.size() == 0 && activeCount > coreSize){
                    removeThread();
                }
            }
        }
    }

    /**
     * InternalTask 和 Thread 的一个组合
     */
    private static class ThreadTask {
        Thread thread;
        InternalTask internalTask;

        public ThreadTask(Thread thread, InternalTask internalTask) {
            this.thread = thread;
            this.internalTask = internalTask;
        }

    }

    @Override
    public void execute(Runnable runnable) {
        if (this.isShutDown) {
            throw new IllegalThreadStateException("The thread pool is destroy");
        }
        // 提交任务
        this.runnableQueue.offer(runnable);
    }

    @Override
    public void shutdown() {
        synchronized (this){
            if(isShutDown){
                return;
            }
            isShutDown = true;
            threadQueue.forEach(threadTask -> {
                threadTask.internalTask.stop();
                threadTask.thread.interrupt();
            });
            this.interrupt();
        }
    }

    @Override
    public int getInitSize() {
        if (this.isShutDown) {
            throw new IllegalThreadStateException("The thread pool is destroy");
        }
        return this.initSize;
    }

    @Override
    public int getMaxSize() {
        if (this.isShutDown) {
            throw new IllegalThreadStateException("The thread pool is destroy");
        }
        return this.maxSize;
    }

    @Override
    public int getCoreSize() {
        if (this.isShutDown) {
            throw new IllegalThreadStateException("The thread pool is destroy");
        }
        return this.coreSize;
    }

    @Override
    public int getQueueSize() {
        if (this.isShutDown) {
            throw new IllegalThreadStateException("The thread pool is destroy");
        }
        return this.runnableQueue.size();
    }

    @Override
    public int getActiveCount() {
        synchronized (this){
            return this.activeCount;
        }
    }

    @Override
    public boolean isShutdown() {
        return this.isShutDown;
    }
}
