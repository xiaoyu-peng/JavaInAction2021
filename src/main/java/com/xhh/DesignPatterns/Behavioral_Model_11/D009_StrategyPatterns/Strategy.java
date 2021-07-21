package com.xhh.DesignPatterns.Behavioral_Model_11.D009_StrategyPatterns;


/**
 * 策略类的定义比较简单，包含一个策略接口和一组实现这个接口的策略类。
 *
 * 因为所有的策略类都实现相同的接口，所以，客户端代码基于接口而非实现编程，可以灵活地替换不同的策略。
 */
public interface Strategy {
  void algorithmInterface();
}

class ConcreteStrategyA implements Strategy {
  @Override
  public void  algorithmInterface() {
    //具体的算法...
  }
}

class ConcreteStrategyB implements Strategy {
  @Override
  public void  algorithmInterface() {
    //具体的算法...
  }
}