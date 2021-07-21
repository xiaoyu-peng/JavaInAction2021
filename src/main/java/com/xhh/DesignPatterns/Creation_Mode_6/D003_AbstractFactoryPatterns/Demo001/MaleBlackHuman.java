package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黑色男性人种
 */
public class MaleBlackHuman extends AbstractBlackHuman{
    @Override
    public boolean getSex() {
        System.out.println("黑色男性");
        return false;
    }
}
