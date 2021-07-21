package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

/**
 * 黄色人种
 */
public abstract class AbstractYellowHuman implements IHuman {
    
    @Override
    public void getColor(){
        System.out.println("黄色人种皮肤是黄色");
    }
    
    @Override
    public void talk(){
        System.out.println("黄色人种讲汉语");
    }
}
