package com.xhh.DesignPatterns.D002_FactoryPatterns.ex_logger;

/**
 * 数据库日志记录器：具体产品
 */
public class DBLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
