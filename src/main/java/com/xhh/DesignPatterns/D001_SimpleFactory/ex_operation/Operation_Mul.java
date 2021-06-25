package com.xhh.DesignPatterns.D001_SimpleFactory.ex_operation;

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
