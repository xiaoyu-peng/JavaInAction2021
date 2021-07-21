package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns;

/**
 * 懒汉式单例模式
 *
 * <p>TODO 懒汉式单例在类加载时并不会自行实例化，而是在第一次调用getInstance()方法时进行实例化, 即延迟加载（lazy load)。
 *    为了避免多个线程同时调用getInstance()方法，可以使用关键字synchronized。
 *         但是给 getInstance()这个方法加了一把大锁（synchronized），导致这个函数的并发度很低。
 *         1）量化一下的话，并发度是 1，也就相当于串行操作了。而这个函数是在单例使用期间，一直会被调用。如果这个单例类偶尔会被用到，那这种实现方式还可以接受。
 *         2）但是，如果频繁地用到，那频繁加锁、释放锁及并发度低等问题，会导致性能瓶颈，这种实现方式就不可取了。
 */
public class S002_LazySingleton {

  private static S002_LazySingleton instance = null;

  private S002_LazySingleton() {}

  /**
   * synchronized的作用：处理多个线程同时访问的线程安全问题；
   *
   * @return
   */
  public static synchronized S002_LazySingleton getInstance() {
    if (instance == null) {
      instance = new S002_LazySingleton();
    }
    return instance;
  }
}
