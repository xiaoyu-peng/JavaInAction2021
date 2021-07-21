package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_nvwa;

/**
 * 黄种人
 */
public class YellowHuman implements IHuman{
    /**
     * 获取肤色
     */
    @Override
    public void getColor() {
        System.out.println("黄色皮肤");
    }

    /**
     * 人会说话
     */
    @Override
    public void getTalk() {
        System.out.println("黄种人讲话");
    }
}
