package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns.ex_loadBalancer;

/**
 * 饿汉式单例类
 * <p>
 * 由于定义静态变量的时候实例化单例类，因此在类加载的时候就已经创建了单例对象.
 *
 * 当类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯一实例将被创建。
 */
public class S001_EagerSingleton {
    private static final S001_EagerSingleton instance = new S001_EagerSingleton();

    private S001_EagerSingleton() {
    }

    public static S001_EagerSingleton getInstance() {
        return instance;
    }
}
