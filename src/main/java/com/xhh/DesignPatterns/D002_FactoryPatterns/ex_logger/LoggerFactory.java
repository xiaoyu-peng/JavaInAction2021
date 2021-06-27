package com.xhh.DesignPatterns.D002_FactoryPatterns.ex_logger;

/**
 * 日志记录器工厂接口：抽象工厂
 */
public interface LoggerFactory {

    /**
     * 默认方式创建
     * @return
     */
    public Logger createLogger();

    /**
     * 使用参数args作为参数创建
     * @param args
     * @return
     */
    public Logger createLogger(String args);

    /**
     * 使用封装在obj中的参数创建
     * @param obj
     * @return
     */
    public Logger createLogger(Object obj);
}
