package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Demo001;


public class ConcreteObserverTwo implements Observer {
  @Override
  public void update(Message message) {
    //TODO: 获取消息通知，执行自己的逻辑...
    System.out.println("ConcreteObserverTwo is notified.");
  }
}
