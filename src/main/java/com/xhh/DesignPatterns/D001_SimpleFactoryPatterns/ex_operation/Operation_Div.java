package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_operation;

/**
 * 除法
 */
public class Operation_Div extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
