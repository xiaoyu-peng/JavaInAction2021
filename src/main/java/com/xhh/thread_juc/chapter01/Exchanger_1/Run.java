package com.xhh.thread_juc.chapter01.Exchanger_1;

import java.util.concurrent.Exchanger;

public class Run {

    public static void main(String[] args) {
        Exchanger<String> stringExchanger = new Exchanger<>();
        ThreadA threadA = new ThreadA(stringExchanger);
        ThreadB threadB = new ThreadB(stringExchanger);

        threadA.setName("THREAD-A");
        threadB.setName("THREAD-B");

        threadA.start();
        threadB.start();
    }
}
