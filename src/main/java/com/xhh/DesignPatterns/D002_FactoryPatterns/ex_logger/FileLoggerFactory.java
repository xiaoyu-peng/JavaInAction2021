package com.xhh.DesignPatterns.D002_FactoryPatterns.ex_logger;

/**
 * 文件日志记录器工厂类：具体工厂
 */
public class FileLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        // 创建文件日志记录器对象
        Logger logger = new FileLogger();
        return logger;
    }

    /**
     * 使用参数args作为参数创建
     *
     * @param args
     * @return
     */
    @Override
    public Logger createLogger(String args) {
        // 使用参数args作为连接字符串来连接数据库，代码省略
        Logger logger = new FileLogger();
        // 初始化数据库日志记录，代码省略...
        return logger;
    }

    /**
     * 使用封装在obj中的参数创建
     *
     * @param obj
     * @return
     */
    @Override
    public Logger createLogger(Object obj) {
        // 使用参数OBJ作为连接字符串来连接数据库，代码省略
        Logger logger = new FileLogger();
        // 初始化数据库日志记录，代码省略...
        return logger;
    }
}
