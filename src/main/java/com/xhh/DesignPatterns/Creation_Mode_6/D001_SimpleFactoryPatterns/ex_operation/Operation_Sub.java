package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 减法计算
 *
 * @author PengHui
 */
public class Operation_Sub extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
