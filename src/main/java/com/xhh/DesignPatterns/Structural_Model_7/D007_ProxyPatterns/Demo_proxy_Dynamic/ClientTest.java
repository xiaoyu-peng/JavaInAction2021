package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo_proxy_Dynamic;

import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.IUserController;
import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.UserController;

/**
 * TODO 动态代理 （实际上，动态代理底层依赖的就是 Java 的反射语法）
 *
 * <p>所谓动态代理（Dynamic Proxy），就是我们不事先为每个原始类编写代理类，而是在运行的时候，动态地创建原始类对应的代理类，然后在系统中用代理类替换掉原始类。
 *
 */
public class ClientTest {
  public static void main(String[] args) {
    // MetricsCollectorProxy使用举例
    MetricsCollectorProxy proxy = new MetricsCollectorProxy();
    IUserController userController = (IUserController) proxy.createProxy(new UserController());
  }
}
