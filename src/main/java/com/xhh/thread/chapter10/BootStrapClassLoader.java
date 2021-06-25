package com.xhh.thread.chapter10;

import org.apache.hadoop.yarn.util.ApplicationClassLoader;

public class BootStrapClassLoader {

    public static void main(String[] args) {
        System.out.println("Bootstrap: "+ String.class.getClassLoader());

        // 根加载器所在的加载路径
        System.out.println(System.getProperty("sun.boot.class.path"));

        // 扩展类加载器所加载的类库
        System.out.println(System.getProperty("java.ext.dirs"));

        // 系统类加载器
        System.out.println(System.getProperty("java.class.path"));
        System.out.println(ApplicationClassLoader.class.getClassLoader());
    }
}
