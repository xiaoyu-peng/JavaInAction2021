package com.xhh.DesignPatterns.Structural_Model_7.D004_DecoratorPatterns;

/**
 * 黑色边框装饰类：具体装饰类
 */
class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }


    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }

}