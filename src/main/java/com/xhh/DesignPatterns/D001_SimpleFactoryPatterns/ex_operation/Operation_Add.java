package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 加法
 *
 * @author PengHui
 */
public class Operation_Add extends Operation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
