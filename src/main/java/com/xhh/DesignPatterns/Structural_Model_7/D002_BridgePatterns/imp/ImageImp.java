package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.imp;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Matrix;

/**
 * 抽象操作系统实现类：实现类接口
 */
public interface ImageImp {

    /**
     * 显示像素矩阵m
     * @param m
     */
    public void doPaint(Matrix m);
}