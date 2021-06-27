package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

/**
 * Spring文本框类：具体产品
 */
public class SpringTextField implements ITextField{
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
