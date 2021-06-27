package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_operation;

/**
 * TODO 简单工厂模式（Simple Factory Pattern）：
 * <p>
 * 定义一个工厂类，根据不同的参数，创建并返回不同的类。其中这些类具有一个公共的父类或是一个接口。
 * 简单工厂模式不属于GoF四人组提出的23种设计模式，它是最简单的工厂模式。
 * <p>
 * <p>
 * TODO 简单工厂模式包含类：
 * 1) Factory：工厂类，内部有是个精通的方法，根据参数选择创建的对象
 * 2) Product：抽象产品类，其作为具体产品的父类，负责定义产品的公共接口
 * 3) ConcreteProduct：具体产品类，有多个，都是继承与抽象产品类，工厂就是创建该类对象
 * <p>
 * <p>
 * TODO 在工厂类中，我们使用里氏原则（子类对象赋值给父类变量）。
 * 即：先声明一个父类对象的变量，根据用户输入判断新建什么具体的运算符对象
 * 【工厂类】只要有一个静态方法，根据条件的返回一个各种方法的父类对象。
 * 【优点】：简单工厂模式，使用工厂对象创建具体的产品对象，从而使得对象的使用和创建过程进行的分离。客户端不需要关注对象是谁创建的，只要通过工厂中静态方法就可以直接获取其需要的对象
 * 【缺点】：工厂类中需要选择创建具体某个对象，所以一旦添加新的
 * 产品则必须要对工厂中的选择逻辑进行修改，违背了开闭原则！
 * 【适应场合】：产品类相对较少的情况，使用简单工厂创建产品对象，这样即实现了生产者与消费者的分离，也不会在工厂类中出现太复杂的判断逻辑！
 * <p>
 * <p>
 * TODO 在软件开发中，为了提高软件系统的可维护性和可复用性，增加软件的可扩展性和灵活性，程序设计要尽量根据以下7 条原则来开发程序，从而提高软件开发效率、节约软件开发成本和维护成本。
 * <p>名称<p>	                                                <p>定义<p>	                                                          <p>使用频率<p>
 * TODO 开闭原则（ Open Closed Principle，OCP ）	            软件实体应该对扩展开放，对修改关闭	                                            ★★★★★
 * TODO 里氏替换原则（Liskov Substitution Principle，LSP）	    父类对象出现的地方都可以使用子类对象替换	                                        ★★★★★
 * TODO 依赖倒置原则（Dependence Inversion Principle，DIP）	1）高层模块不应该依赖低层模块，两者都应该依赖其抽象；                                 ★★★★★
 *                                                          2）抽象不应该依赖细节，细节应该依赖抽象
 * TODO 单一职责原则（Single Responsibility Principle，SRP）	一个类只负责一个功能领域中的相应职责	                                            ★★★★☆
 * TODO 接口隔离原则（Interface Segregation Principle ,ISP)	不要使用单一的总接口，而是使用具体的有针对性的小接口	                                ★★☆☆☆
 * TODO 迪米特法则(Law of Demeter, LoD)	                    一个软件实体应当尽可能少地与其他实体发生相互作用	                                    ★★★☆☆
 * TODO 合成复用原则（Composite Reuse Principle,CRP）	        尽量使用对象组合，而不是使用继承来达到复用的目的	                                    ★★★★☆
 */
public class OptionerFactory {
    public static Operation creatOperation(String oper){
        Operation operation=null;
        switch (oper) {
            case "+":
                operation=new Operation_Add();
                break;
            case "-":
                operation=new Operation_Sub();
                break;
            case "*":
                operation=new Operation_Mul();
                break;
            case "/":
                operation=new Operation_Div();
                break;
        }
        return operation;
    }
}