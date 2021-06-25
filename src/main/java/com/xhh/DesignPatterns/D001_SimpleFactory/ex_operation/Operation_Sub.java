package com.xhh.DesignPatterns.D001_SimpleFactory.ex_operation;

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
