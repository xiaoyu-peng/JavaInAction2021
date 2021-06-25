package com.xhh.thread.chapter08;

/**
 * 创建线程的工厂
 */
@FunctionalInterface
public interface ThreadFactory {

    Thread currentThread(Runnable runnable);
}
