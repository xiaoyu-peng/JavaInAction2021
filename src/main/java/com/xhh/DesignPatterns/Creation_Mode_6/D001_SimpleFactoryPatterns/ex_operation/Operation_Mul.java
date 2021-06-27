package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 乘法
 *
 * @author PengHui
 */
public class Operation_Mul extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
