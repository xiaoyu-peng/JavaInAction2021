package com.xhh.thread.chapter01;

import java.util.concurrent.TimeUnit;

public class TestConcurrency {

    public static void main(String[] args) {
        Thread t1 = new Thread(TestConcurrency::browseNews);
        t1.start();

        enjoyMusic();
    }

    private static void browseNews() {
        for(;;){
            System.out.println("Uh-huh, the good news.");
            sleep(1);
        }
    }

    private static void enjoyMusic() {
        for(;;){
            System.out.println("ha-ha, the nice music.");
            sleep(1);
        }
    }

    private static void sleep(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
