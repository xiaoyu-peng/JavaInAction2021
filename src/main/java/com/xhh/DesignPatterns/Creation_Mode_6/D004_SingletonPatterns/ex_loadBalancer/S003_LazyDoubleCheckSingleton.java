package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns.ex_loadBalancer;

/**
 * 双重检查锁定（Double-Check Locking)
 */
public class S003_LazyDoubleCheckSingleton {


    /**
     * 注意： 静态成员变量之前，需要增加 修饰符 volatile
     */
    private volatile static S003_LazyDoubleCheckSingleton instance = null;

    private S003_LazyDoubleCheckSingleton() {
    }

    public static S003_LazyDoubleCheckSingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (S003_LazyDoubleCheckSingleton.class) {
                // 第二重判断
                if (instance == null) {
                    instance = new S003_LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
