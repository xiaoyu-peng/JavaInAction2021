package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.Demo001;

import com.sun.media.sound.SoftTuning;

public class ClientTest {

    public static void main(String[] args) {

        IHumanFactory maleFactory = new MaleFactory();
        IHumanFactory femaleFactory = new FemaleFactory();

        IHuman blackHuman = maleFactory.createBlackHuman();
        System.out.println(blackHuman.getSex());

        IHuman yellowHuman = femaleFactory.createYellowHuman();
        System.out.println(yellowHuman.getSex());

    }
}
