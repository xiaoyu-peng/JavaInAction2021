package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo003;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002.UserService;

import java.util.List;
import java.util.concurrent.Executors;


/**
 *
 */
public class UserController {
    // 依赖注入
    private UserService userService;
    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {

        // 同步阻塞模式
        //eventBus = new EventBus();

        // TODO 异步非阻塞模式【EventBus 实现了同步阻塞的观察者模式，AsyncEventBus 继承自 EventBus，提供了异步非阻塞的观察者模式。】
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List observers) {
        for (Object observer : observers) {
            // TODO EventBus 类提供了 register() 函数用来注册观察者,它可以接受任何类型（Object）的观察者。
            //      而在经典的观察者模式的实现中，register() 函数必须接受实现了同一 Observer 接口的类对象。
            eventBus.register(observer);
        }
    }

    public void delRegObservers(Object observer) {
        //unregister() 函数用来从 EventBus 中删除某个观察者。
        eventBus.unregister(observer);
    }

    public Long register(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        // TODO 跟经典的观察者模式的不同之处在于，当我们调用 post() 函数发送消息的时候，并非把消息发送给所有的观察者，而是发送给可匹配的观察者。
        //      所谓可匹配指的是，能接收的消息类型是发送消息（post 函数定义中的 event）类型的父类。
        eventBus.post(userId);
        return userId;
    }
}