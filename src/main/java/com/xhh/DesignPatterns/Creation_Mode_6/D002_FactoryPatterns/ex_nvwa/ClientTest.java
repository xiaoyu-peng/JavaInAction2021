package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_nvwa;

public class ClientTest {

    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        IHuman human1 = humanFactory.createHuman(BlackHuman.class);
        human1.getColor();
        human1.getTalk();

        System.out.println("------------分隔线-----------");
        IHuman human2 = humanFactory.createHuman(YellowHuman.class);
        human2.getColor();
        human2.getTalk();
    }
}
