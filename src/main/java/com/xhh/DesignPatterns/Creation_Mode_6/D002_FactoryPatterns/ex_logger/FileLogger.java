package com.xhh.DesignPatterns.Creation_Mode_6.D002_FactoryPatterns.ex_logger;

/**
 * 文件记录器：具体产品
 */
public class FileLogger implements ILogger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
