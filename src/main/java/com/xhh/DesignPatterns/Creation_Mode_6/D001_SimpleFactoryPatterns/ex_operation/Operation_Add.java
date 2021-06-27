package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 加法
 *
 * @author PengHui
 */
public class Operation_Add extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA() + getNumberB();
    }
}
