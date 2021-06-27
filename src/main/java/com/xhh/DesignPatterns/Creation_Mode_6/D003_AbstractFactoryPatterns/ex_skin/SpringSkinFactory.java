package com.xhh.DesignPatterns.Creation_Mode_6.D003_AbstractFactoryPatterns.ex_skin;


/**
 * Spring皮肤工厂：具体工厂
 */
public class SpringSkinFactory implements ISkinFactory {
    @Override
    public IButton createButton() {
        return new SpringButton();
    }

    @Override
    public ITextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public IComboBox createComboBox() {
        return new SpringComboBox();
    }
}
