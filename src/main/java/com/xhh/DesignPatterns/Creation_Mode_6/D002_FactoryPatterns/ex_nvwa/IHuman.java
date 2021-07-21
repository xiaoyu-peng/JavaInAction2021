package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_nvwa;

/**
 * 人类接口，抽象产品类Product负责定义产品的共性
 */
public interface IHuman {

    /**
     * 获取肤色
     */
    public void getColor();

    /**
     * 人会说话
     */
    public void getTalk();
}
