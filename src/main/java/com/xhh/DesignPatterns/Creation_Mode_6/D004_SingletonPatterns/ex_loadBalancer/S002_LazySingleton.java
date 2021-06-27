package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns.ex_loadBalancer;

/**
 * 懒汉式单例模式
 *
 * TODO 懒汉式单例在类加载时并不会自行实例化，而是在第一次调用getInstance()方法时进行实例化, 即延迟加载（lazy load).  为了避免多个线程同事调用getInstance()方法，可以使用关键字synchronized。
 */
public class S002_LazySingleton {

    private static S002_LazySingleton instance = null;

    private S002_LazySingleton(){}


    /**
     * synchronized的作用：处理多个线程同时访问的线程安全问题
     * @return
     */
    synchronized public static S002_LazySingleton getInstance(){
        if(instance == null){
            instance = new S002_LazySingleton();
        }
        return instance;
    }


}
