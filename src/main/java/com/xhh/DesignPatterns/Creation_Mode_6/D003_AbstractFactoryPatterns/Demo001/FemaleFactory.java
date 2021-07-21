package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

public class FemaleFactory implements IHumanFactory{
    /**
     * 制造一个黑色人种 女性
     *
     * @return
     */
    @Override
    public IHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }

    /**
     * 制造一个黄色人种 女性
     *
     * @return
     */
    @Override
    public IHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
