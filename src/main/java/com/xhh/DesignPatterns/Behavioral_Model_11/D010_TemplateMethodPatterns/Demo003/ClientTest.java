package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns.Demo003;


/**
 * 模板方法设计模式： 复用和扩展
 *
 * 模板模式把一个算法中不变的流程抽象到父类的模板方法 templateMethod() 中，将可变的部分 method1()、method2() 留给子类 ContreteClass1 和 ContreteClass2 来实现。
 *
 * 所有的子类都可以复用父类中模板方法定义的流程代码。
 */
public class ClientTest {

    public static void main(String[] args) {

        AbstractClass demo = new ConcreteClass1();
        demo.templateMethod();
    }
}
