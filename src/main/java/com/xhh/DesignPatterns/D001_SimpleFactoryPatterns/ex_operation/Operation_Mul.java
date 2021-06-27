package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 乘法
 *
 * @author PengHui
 */
public class Operation_Mul extends Operation {
    @Override
    public double getResult() {
        return getNumberA() * getNumberB();
    }
}
