package com.xhh.DesignPatterns.D001_SimpleFactory.ex_operation;

import lombok.Data;

/**
 * 计算器的父类
 *
 * @author PengHui
 */
@Data
public abstract class Operation {
    private double numberA;
    private double numberB;

    /**
     * 获取结果
     * @return
     */
    public abstract double getResult();
}
