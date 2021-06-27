package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;


/**
 * Summer皮肤工厂：具体工厂
 */
public class SummerSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SummerButton();
    }

    @Override
    public ITextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SummerComboBox();
    }
}
