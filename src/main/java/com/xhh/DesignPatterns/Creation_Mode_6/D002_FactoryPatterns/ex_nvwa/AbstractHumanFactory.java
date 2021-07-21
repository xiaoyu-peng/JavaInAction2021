package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_nvwa;

/**
 * 抽象工厂，Creator为抽象创建类。
 *
 * 定义泛型T 1） 必须是Class类型   2） 必须是IHuman的实现类
 */
public abstract class AbstractHumanFactory {

    public abstract <T extends IHuman> T createHuman(Class<T> c);

}
