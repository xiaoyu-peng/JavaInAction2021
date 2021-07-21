package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

public interface IUserController {
  UserVo login(String telephone, String password);

  UserVo register(String telephone, String password);
}
