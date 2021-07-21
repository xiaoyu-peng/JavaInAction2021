package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo001;

/**
 * Logger：日志记录类，业务类，它提供方法Log()来保存日志。
 */
public class Logger {

    public void logDb(Integer userId) {
        System.out.println("更新数据库，用户'" + userId + "'查询次数加1");
    }
}
