package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;


import java.util.Scanner;

/**
 * 测试类
 * @author PengHui
 */
public class TestMain {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个数");
        double A = scanner.nextInt();
        System.out.println("输入操作符");
        String oper = scanner.next();
        System.out.println("输入第二个数");
        double B = scanner.nextInt();
        AbstractOperation operation = OptionerFactory.creatOperation(oper);
        operation.setNumberA(A);
        operation.setNumberB(B);
        double result = operation.getResult();
        System.out.println("结果：" + result);
    }
}