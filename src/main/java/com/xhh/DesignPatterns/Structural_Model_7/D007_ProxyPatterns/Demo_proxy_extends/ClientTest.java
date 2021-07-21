package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo_proxy_extends;

import com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.UserController;

public class ClientTest {
  public static void main(String[] args) {
    // UserControllerProxy使用举例
    UserController userController = new UserControllerProxy();
  }
}
