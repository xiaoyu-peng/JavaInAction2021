package com.xhh.DesignPatterns.D002_StrategyPatterns;

/**
 * TODO 抽象策略角色，是对策略、算法家族的抽象，通常为接口，定义每个策略或算法必须具有的方法和属性。algorithm是“运算法则”的意思。
 *
 * @author PengHui
 */
public abstract class Strategy {
    /**
     * 算法方法
     */
    public abstract void algorithmInterface();
}
