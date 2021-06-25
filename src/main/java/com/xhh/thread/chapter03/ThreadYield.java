package com.xhh.thread.chapter03;

import java.util.stream.IntStream;

/**
 * TODO 【sleep和yield的区别】
 * 1) sleep 会导致当前线程暂定指定的时间，没有CPU时间片的消耗。
 * 2) yield 只是对CPU调度器的一个提示，如果CPU调度器没有忽略这个提示，它会导致线程上下文的切换。
 * 3）sleep会使线程短暂的block，会在给定的时间内释放CPU资源
 * 4）yield会使Running状态的Thread进入Runnable状态（如果CPU调度器没有忽略这个提示的话）
 * 5）sleep几乎百分之百地完成了给定时间的休眠，而yield的提示并不能一定担保。
 * 6）一个线程sleep另一个线程调用interrupt会捕获到中断信号，而yield则不会。
 *
 *
 */
public class ThreadYield {

    public static void main(String[] args) {

        IntStream.range(0, 2).mapToObj(ThreadYield::createT).forEach(Thread::start);
    }

    private static Thread createT(int index) {
        return new Thread(() -> {
            if (index == 0) {
                Thread.yield();
            }
            System.out.println(index);
        });
    }

}
