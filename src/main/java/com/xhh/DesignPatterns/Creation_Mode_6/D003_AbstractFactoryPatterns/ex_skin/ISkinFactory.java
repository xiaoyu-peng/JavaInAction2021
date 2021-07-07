package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;


/**
 * 界面皮肤工厂接口：抽象工厂
 */
public interface ISkinFactory {

    public IButton createButton();
    public ITextField createTextField();
    public IComboBox createComboBox();
}
