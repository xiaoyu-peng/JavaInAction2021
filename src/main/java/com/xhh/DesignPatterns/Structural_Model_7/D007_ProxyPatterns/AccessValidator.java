package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

/**
 * AccessValidator：身份验证类，业务类，它提供方法Validate()来实现身份验证。
 */
public class AccessValidator {

    public boolean validateUserId(Integer userId) {
        System.out.println("模拟在数据库中验证用户'" + userId + "'是否是合法用户");
        System.out.println("登录成功！！！");
        return true;
    }
}
