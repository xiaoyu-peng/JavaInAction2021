package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_operation;

import lombok.Data;

/**
 * 计算器的父类
 *
 * @author PengHui
 */
@Data
public abstract class AbstractOperation {
    private double numberA;
    private double numberB;

    /**
     * 获取结果
     * @return
     */
    public abstract double getResult();
}
