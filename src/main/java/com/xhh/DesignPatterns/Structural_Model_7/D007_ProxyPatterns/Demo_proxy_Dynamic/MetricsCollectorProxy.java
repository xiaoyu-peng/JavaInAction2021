package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo_proxy_Dynamic;

import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.MetricsCollector;
import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.RequestInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * TODO 动态代理
 *      Spring AOP 底层的实现原理就是基于动态代理。
 *      1）用户配置好需要给哪些类创建代理，并定义好在执行原始类的业务代码前后执行哪些附加功能。
 *      2）Spring 为这些类创建动态代理对象，并在 JVM 中替代原始类对象。
 *      3）原本在代码中执行的原始类的方法，被换作执行代理类的方法，也就实现了给原始类添加附加功能的目的。
 */
public class MetricsCollectorProxy {

  private MetricsCollector metricsCollector;

  public MetricsCollectorProxy() {
    this.metricsCollector = new MetricsCollector();
  }

  public Object createProxy(Object proxiedObject) {
    Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
    DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
    return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
  }

  private class DynamicProxyHandler implements InvocationHandler {
    private Object proxiedObject;

    public DynamicProxyHandler(Object proxiedObject) {
      this.proxiedObject = proxiedObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      long startTimestamp = System.currentTimeMillis();
      // 大力
      Object result = method.invoke(proxiedObject, args);

      long endTimeStamp = System.currentTimeMillis();
      long responseTime = endTimeStamp - startTimestamp;
      String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
      RequestInfo requestInfo = new RequestInfo(apiName, responseTime, startTimestamp);
      metricsCollector.recordRequest(requestInfo);
      return result;
    }
  }
}
