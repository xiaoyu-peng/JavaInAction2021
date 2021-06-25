package com.xhh.thread.chapter09;

/**
 * ①在②前 输出 0 1
 *
 * ②在①前 输出 1 1
 */
public class Singleton {

    private static int x = 0;

    private static int y;

    // ①
    private static Singleton instance = new Singleton();

    // ②
    private Singleton() {
        x++;
        y++;
    }

    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.x);
        System.out.println(instance.y);
    }

    /**
     *
     */
}
