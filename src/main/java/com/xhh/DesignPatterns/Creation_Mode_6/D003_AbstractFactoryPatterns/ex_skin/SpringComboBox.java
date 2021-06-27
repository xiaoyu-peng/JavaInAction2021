package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

/**
 * Spring组合框类：具体产品
 */
public class SpringComboBox implements IComboBox{
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
