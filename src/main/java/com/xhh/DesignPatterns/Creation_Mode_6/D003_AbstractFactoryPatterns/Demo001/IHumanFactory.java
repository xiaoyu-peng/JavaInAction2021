package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

public interface IHumanFactory {

    /**
     * 制造一个黑色人种
     * @return
     */
    public IHuman createBlackHuman();

    /**
     * 制造一个黄色人种
     * @return
     */
    public IHuman createYellowHuman();
}
