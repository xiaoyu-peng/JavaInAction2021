package com.xhh.DesignPatterns.Structural_Model_7.D004_DecoratorPatterns.Demo001;

class ClientTest {

    public static void main(String args[]) {

        //全部使用抽象构件定义
        Component component, componentSB, componentBB;
        //定义具体构件
        component = new WindowComponent();
        //定义装饰后的构件
        componentSB = new ScrollBarDecorator(component);
        //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }

}