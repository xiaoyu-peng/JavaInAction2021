package com.xhh.thread.chapter09;

public class ActiveLoadTest {

    public static void main(String[] args) {

        /**
         * 1) new 导致类的初始化
         */

        /**
         * 2）访问类的静态变量  TODO 注意：通过子类使用父类的静态变量，只会导致父类的初始化，子类不会初始化。
         */
        //System.out.println(Simple.x);

        /**
         * 3）访问类的静态方法
         */
        Simple.test();

        /**
         * 4) 对类进行反射
         */
        /*try {
            Class.forName("com.xhh.thread.chapter09.Simple.java");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        /**
         * 5) 初始化子类会导致父类初始化
         */

        System.out.println(GlobalConstants.RANDOM);
    }

}
