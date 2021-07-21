package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

public class MaleFactory implements IHumanFactory{
    /**
     * 制造一个黑色人种 男性
     *
     * @return
     */
    @Override
    public IHuman createBlackHuman() {
        return new MaleBlackHuman();
    }

    /**
     * 制造一个黄色人种 男性
     *
     * @return
     */
    @Override
    public IHuman createYellowHuman() {
        return new MaleYellowHuman();
    }
}
