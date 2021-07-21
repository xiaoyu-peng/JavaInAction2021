package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns.Demo;

/**
 * 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 */
interface OfficialDocument extends Cloneable {

    public OfficialDocument clone();

    public void display();

}
