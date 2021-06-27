package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 除法
 */
public class Operation_Div extends AbstractOperation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
