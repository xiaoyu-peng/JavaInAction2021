package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns.Demo001;

public class Client {

    public static void main(String[] args) {
        AbstractClass class1 = new CreateClass1();
        AbstractClass class2 = new CreateClass2();
        // 调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }

}
