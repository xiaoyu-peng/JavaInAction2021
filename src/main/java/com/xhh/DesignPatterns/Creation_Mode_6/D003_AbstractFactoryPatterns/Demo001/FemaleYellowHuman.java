package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黄色女性人种
 */
public class FemaleYellowHuman extends AbstractBlackHuman{
    @Override
    public boolean getSex() {
        System.out.println("黄色女性");
        return false;
    }
}
