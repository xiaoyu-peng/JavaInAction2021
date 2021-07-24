package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns.Demo;


/**
 * //可行性分析报告(Feasibility Analysis Report)类
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {

        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }

        return far;
    }


    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }

}