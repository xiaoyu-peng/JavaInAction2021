package com.xhh.DesignPatterns.Creation_Mode_6.D005_PrototypePatterns.Demo;


/**
 * 在PrototypeManager中定义了一个Hashtable类型的集合对象，使用“键值对”来存储原型对象，客户端可以通过Key（如“far”或“srs”）来获取对应原型对象的克隆对象。
 *
 * PrototypeManager类提供了类似工厂方法的getOfficialDocument()方法用于返回一个克隆对象。
 *
 * 在本实例代码中，我们将PrototypeManager设计为单例类，使用饿汉式单例实现，确保系统中有且仅有一个PrototypeManager对象，有利于节省系统资源，并可以更好地对原型管理器对象进行控制。
 *
 */
public class Client {

    public static void main(String args[]) {

        //获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        OfficialDocument doc1, doc2, doc3, doc4;

        doc1 = pm.getOfficialDocument("far");
        doc1.display();

        doc2 = pm.getOfficialDocument("far");
        doc2.display();

        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();

        doc4 = pm.getOfficialDocument("srs");
        doc4.display();

        System.out.println(doc3 == doc4);

    }

}