package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo002;

/**
 * TODO 观察者模式  同步方式实现
 *
 * 假设我们在开发一个 P2P 投资理财系统，用户注册成功之后，我们会给用户发放投资体验金。
 *
 * 用户注册成功之后，不再发放体验金，而是改为发放优惠券，并且还要给用户发送一封“欢迎注册成功”的站内信。
 *
 * 这种情况下，我们就需要频繁地修改 register() 函数中的代码，违反开闭原则。而且，如果注册成功之后需要执行的后续操作越来越多，那 register() 函数的逻辑会变得越来越复杂，也就影响到代码的可读性和可维护性。
 *
 */
public class ClientTest {
}
