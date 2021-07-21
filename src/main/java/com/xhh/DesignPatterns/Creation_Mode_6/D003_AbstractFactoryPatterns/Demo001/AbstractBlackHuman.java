package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黑色人种
 */
public abstract class AbstractBlackHuman implements IHuman {

    @Override
    public void getColor(){
        System.out.println("黑色人种皮肤是黑色");
    }

    @Override
    public void talk(){
        System.out.println("黑色人种讲英语");
    }
}
