package com.xhh.DesignPatterns.Behavioral_Model_11.D002_StrategyPatterns;

/**
 * TODO 具体策略角色，用于实现抽象策略中的操作，即实现具体的算法，下方用print代替。测试类共3个ConcreteStrategy，其它两个类与ConcreteStrategyA同理。
 * @author PengHui
 */
public class ConcreteStrategyB extends Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("算法B具体实现");
    }
}
