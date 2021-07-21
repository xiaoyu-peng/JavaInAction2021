package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns;

/**
 * 饿汉式不支持延迟加载，懒汉式有性能问题，不支持高并发。
 * TODO 双重检查锁定（Double-Check Locking)
 *      1) 既支持延迟加载，又支持高并发。
 *      2) 只要 instance 被创建之后，即便再调用 getInstance() 函数也不会再进入到加锁逻辑中了。
 *      3）解决懒汉式并发度低的问题
 */
public class S003_LazyDoubleCheckSingleton {

  /** TODO 注意： 静态成员变量之前，需要增加 修饰符 volatile，禁止指令重排序。 */
  private static volatile S003_LazyDoubleCheckSingleton instance = null;

  private S003_LazyDoubleCheckSingleton() {}

  /** @return */
  public static S003_LazyDoubleCheckSingleton getInstance() {
    // 第一重判断
    if (instance == null) {
      // 锁定代码块，此处为类级别的锁
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
