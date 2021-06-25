package com.xhh.thread.chapter01;


import java.util.stream.IntStream;

public class ThreadInitNumTest {

    public static void main(String[] args) {
        IntStream.range(0, 5).boxed().map(
                i -> new Thread(
                        () -> System.out.println(Thread.currentThread().getName() +"   "+ Thread.currentThread().getId())
                )
        ).forEach(Thread::start);
    }
}
