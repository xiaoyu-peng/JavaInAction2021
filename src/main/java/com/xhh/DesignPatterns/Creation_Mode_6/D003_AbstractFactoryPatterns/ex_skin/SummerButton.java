package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

/**
 * Summer按钮类：具体产品
 */
public class SummerButton implements IButton{
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}