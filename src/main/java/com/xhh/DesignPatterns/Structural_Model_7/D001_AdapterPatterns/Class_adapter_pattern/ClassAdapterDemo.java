package com.xhh.DesignPatterns.Structural_Model_7.D001_AdapterPatterns.Class_adapter_pattern;

/**
 * TODO 类适配器模式和对象适配器模式最大的区别在于适配器和适配者之间的关系不同，对象适配器模式中适配器和适配者之间是【关联关系】，而类适配器模式中适配器和适配者是【继承关系】
 *      由于Java、C#等语言不支持多重类继承，因此类适配器的使用受到很多限制，例如如果目标抽象类Target不是接口，而是一个类，就无法使用类适配器；
 *      此外，如果适配者Adapter为最终(Final)类，也无法使用类适配器。在Java等面向对象编程语言中，大部分情况下我们使用的是对象适配器，类适配器较少使用。
 *
 *  根据类适配器模式结构图，适配器类实现了抽象目标类接口Target，并继承了适配者类，在适配器类的request()方法中调用所继承的适配者类的specificRequest()方法，实现了适配。
 */
public class ClassAdapterDemo {

    /**
     * class Adapter extends Adaptee implements Target {
     * 	public void request() {
     * 		specificRequest();
     *  }
     * }
     */
}
