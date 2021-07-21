package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns;

/**
 * 饿汉式单例类【因为类加载的方式是按需加载，且只加载一次。 所以天生线程安全】
 *
 * <p>由于定义静态变量的时候实例化单例类，因此在类加载的时候就已经创建了单例对象.
 *
 * <p>当类被加载时，静态变量instance就会被初始化，此时类的私有构造函数会被调用，单例类的唯一实例将被创建。
 *
 * <p>TODO 根据 fail-fast的设计原则（有问题及早暴露），如果初始化资源消耗过多，反而推荐饿汉式，早日发现问题。
*          1）如果实例占用资源多，按照 fail-fast 的设计原则（有问题及早暴露），那我们也希望在程序启动时就将这个实例初始化好。
*          2）如果资源不够，就会在程序启动的时候触发报错（比如 Java 中的 PermGen Space OOM），我们可以立即去修复。
*          3）这样也能避免在程序运行一段时间后，突然因为初始化这个实例占用资源过多，导致系统崩溃，影响系统的可用性。
 *
 * <p>总结：饿汉式的实现方式，在类加载的期间，就已经将 instance 静态实例初始化好了。
 *         优点：instance实例的创建是线程安全的
 *         缺点：不支持延迟加载
 */
public class S001_EagerSingleton {

  private static final S001_EagerSingleton instance = new S001_EagerSingleton();

  private S001_EagerSingleton() {}

  public static S001_EagerSingleton getInstance() {
    return instance;
  }
}
