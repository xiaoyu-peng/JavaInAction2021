package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    // 依赖注入
    private UserService userService;
    // 一次性设置好，之后也不可能动态的修改
    private List<RegObserver> regObservers = new ArrayList<>();

    public void setRegObservers(List observers) {
        regObservers.addAll(observers);
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        for (RegObserver observer : regObservers) {
            observer.handleRegSuccess(userId);
        }
        return userId;
    }
}