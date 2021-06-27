package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

/**
 * Spring按钮类：具体产品
 */
public class SpringButton implements IButton{
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}
