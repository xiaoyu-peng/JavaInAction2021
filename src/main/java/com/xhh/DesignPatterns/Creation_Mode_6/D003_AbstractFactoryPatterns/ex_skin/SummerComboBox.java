package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

/**
 * Summer组合框类：具体产品
 */
public class SummerComboBox implements IComboBox{
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
