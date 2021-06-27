package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;

public class SummerTextField implements ITextField{
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
