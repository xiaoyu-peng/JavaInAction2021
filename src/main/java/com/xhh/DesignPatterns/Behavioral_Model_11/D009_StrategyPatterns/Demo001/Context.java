package com.xhh.DesignPatterns.Behavioral_Model_11.D009_StrategyPatterns.Demo001;


/**
 * TODO 策略模式（Strategy），定义了一组算法，将每个算法都封装起来，并且使它们之间可以互换
 *      1) Context是上下文，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用；
 *      2) Strategy是策略类，用于定义所有支持算法的公共接口；
 *      3) ConcreteStrategy是具体策略类，封装了具体的算法或行为，继承于Strategy。
 *
 * TODO Context上下文角色，也叫Context封装角色，起承上启下的作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 * @author PengHui
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文接口
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
