package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黑色女性人种
 */
public class FemaleBlackHuman extends AbstractBlackHuman{
    @Override
    public boolean getSex() {
        System.out.println("黑色女性");
        return false;
    }
}
