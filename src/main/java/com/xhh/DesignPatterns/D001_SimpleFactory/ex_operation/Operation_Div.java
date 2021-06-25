package com.xhh.DesignPatterns.D001_SimpleFactory.ex_operation;

/**
 * 除法
 */
public class Operation_Div extends Operation {
    @Override
    public double getResult() {
        return getNumberA() / getNumberB();
    }
}
