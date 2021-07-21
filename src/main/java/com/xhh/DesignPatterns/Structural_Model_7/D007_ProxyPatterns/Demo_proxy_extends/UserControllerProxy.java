package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo_proxy_extends;


import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.MetricsCollector;
import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.RequestInfo;
import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.UserController;
import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.UserVo;

/**
 * 代理模式，由于不同的接口，故通过继承实现
 *
 * UserVo userVo = super.login(telephone, password);
 *
 */
public class UserControllerProxy extends UserController {
  private MetricsCollector metricsCollector;

  public UserControllerProxy() {
    this.metricsCollector = new MetricsCollector();
  }

  @Override
  public UserVo login(String telephone, String password) {
    long startTimestamp = System.currentTimeMillis();

    UserVo userVo = super.login(telephone, password);

    long endTimeStamp = System.currentTimeMillis();
    long responseTime = endTimeStamp - startTimestamp;
    RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
    metricsCollector.recordRequest(requestInfo);

    return userVo;
  }

  @Override
  public UserVo register(String telephone, String password) {
    long startTimestamp = System.currentTimeMillis();

    UserVo userVo = super.register(telephone, password);

    long endTimeStamp = System.currentTimeMillis();
    long responseTime = endTimeStamp - startTimestamp;
    RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
    metricsCollector.recordRequest(requestInfo);

    return userVo;
  }
}
