package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.image;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Matrix;

/**
 * PNG格式图像：扩充抽象类
 */
public class PNGImage extends AbsImage {
    @Override
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}