package com.xhh.DesignPatterns.Creation_Mode_6.D006_BuilderPatterns;

/**
 * TODO 建造者模式(Builder Pattern)：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。建造者模式是一种对象创建型模式。
 *
 * TODO 在建造者模式结构图中包含如下几个角色：
 *
 * ● Builder（抽象建造者）：它为创建一个产品Product对象的各个部件指定抽象接口，在该接口中一般声明两类方法:
 *   1) 是buildPartX()，它们用于创建复杂对象的各个部件；
 *   2) 是getResult()，它们用于返回复杂对象。Builder既可以是抽象类，也可以是接口。
 *
 * ● ConcreteBuilder（具体建造者）：它实现了Builder接口，实现各个部件的具体构造和装配方法，定义并明确它所创建的复杂对象，也可以提供一个方法返回创建好的复杂产品对象。
 *
 * ● Product（产品角色）：它是被构建的复杂对象，包含多个组成部件，具体建造者创建该产品的内部表示并定义它的装配过程。
 *
 * ● Director（指挥者）：指挥者又称为导演类，它负责安排复杂对象的建造次序，指挥者与抽象建造者之间存在关联关系，可以在其construct()建造方法中调用建造者对象的部件构造与装配方法，完成复杂对象的建造。
 *   客户端一般只需要与指挥者进行交互，在客户端确定具体建造者的类型，并实例化具体建造者对象（也可以通过配置文件和反射机制），然后通过指挥者类的构造函数或者Setter方法将该对象传入指挥者类中。

 */
public class Client {

    public static void main(String args[]) {

        /**
         * 针对抽象建造者编程,生成具体建造者
         */
        ActorBuilder ab = new AngelBuilder();

        /**
         * 通过指挥者创建完整的建造者对象
         */
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab);

        System.out.println("外观：" + actor.getType());
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());

    }
}
