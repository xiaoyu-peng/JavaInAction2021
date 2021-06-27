package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns.ex_loadBalancer;


/**
 * TODO 静态内部类，创建单例对象，再将该单例对象通过getInstance()方法返回给外部使用。
 * 
 * 编译并运行上述代码，运行结果为：true，即创建的单例对象s1和s2为同一对象。
 *
 * 由于静态单例对象没有作为Singleton的成员变量直接实例化，因此类加载时不会实例化Singleton，第一次调用getInstance()时将加载内部类HolderClass，
 * 在该内部类中定义了一个static类型的变量instance，此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量只能初始化一次。
 *
 * 由于getInstance()方法没有任何线程锁定，因此其性能不会造成任何影响。
 *
 * 通过使用IoDH，我们既可以实现延迟加载，又可以保证线程安全，不影响系统性能，不失为一种最好的Java语言单例模式实现方式（其缺点是与编程语言本身的特性相关，很多面向对象语言不支持IoDH）

 */
public class S004_IoDH_singleton {

    private S004_IoDH_singleton() {
    }

    private static class HolderClass {
        private final static S004_IoDH_singleton INSTANCE = new S004_IoDH_singleton();
    }

    public static S004_IoDH_singleton getInstance() {
        return HolderClass.INSTANCE;
    }

    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        S004_IoDH_singleton s1, s2;
        s1 = S004_IoDH_singleton.getInstance();
        s2 = S004_IoDH_singleton.getInstance();
        System.out.println(s1==s2);
    }
}
