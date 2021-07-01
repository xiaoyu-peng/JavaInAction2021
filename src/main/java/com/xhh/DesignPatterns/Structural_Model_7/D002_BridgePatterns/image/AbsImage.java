package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.image;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.imp.ImageImp;

/**
 * 抽象图像类：抽象类
 */
public abstract class AbsImage {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
