package com.xhh.DesignPatterns.D002_FactoryPatterns.ex_logger;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.xhh.DesignPatterns.utils.XMLUtil;

/**
 * 工厂模式测试类
 * <p>
 * Class对象的生成方式如下：
 * <p>
 * 1.类名.class 说明： JVM将使用类装载器, 将类装入内存(前提是:类还没有装入内存),不做类的初始化工作.返回Class的对象
 * <p>
 * 2.Class.forName(“类名字符串”) （注：类名字符串是包名+类名） 说明：装入类,并做类的静态初始化，返回Class的对象
 * <p>
 * 3.实例对象.getClass() 说明：对类进行静态初始化、非静态初始化；返回引用运行时真正所指的对象(因为:子对象的引用可能会赋给父对象的引用变量中)所属的类的Class的对象
 * <p>
 * 结论：
 * 我们知道，静态的方法属性初始化，是在加载类的时候初始化。而非静态方法属性初始化，是new类实例对象的时候加载。
 * <p>
 * 因此，这段程序说明，三种方式生成Class对象，其实只有一个Class对象。在生成Class对象的时候，首先判断内存中是否已经加载。
 */
public class TestFactory {

    public static final String PACKAGE_NAME = "com.xhh.DesignPatterns.D002_FactoryPatterns.ex_logger";

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;

        loggerFactory = new DBLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();


        System.out.println("----------------------分隔符---------------------");


        // 利用配置文件获取类名
        String className = XMLUtil.getNodeValue("className", 0);
        // 利用反射创建实例对象
        try {
            Class c = Class.forName(PACKAGE_NAME + "." + className);
            Object obj = c.newInstance();
            loggerFactory = (LoggerFactory) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger = loggerFactory.createLogger();
        logger.writeLog();

    }
}
