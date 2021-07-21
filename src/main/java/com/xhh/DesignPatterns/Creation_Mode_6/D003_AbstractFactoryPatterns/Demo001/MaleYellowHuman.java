package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黄色男性人种
 */
public class MaleYellowHuman extends AbstractBlackHuman{
    @Override
    public boolean getSex() {
        System.out.println("黄色男性");
        return false;
    }
}
