package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 减法计算
 *
 * @author PengHui
 */
public class Operation_Sub extends Operation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
