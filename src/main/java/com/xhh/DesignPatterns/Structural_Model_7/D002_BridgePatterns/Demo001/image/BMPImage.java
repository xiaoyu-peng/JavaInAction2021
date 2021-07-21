package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.image;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.Matrix;

/**
 * BMP格式图像：扩充抽象类
 */
public class BMPImage extends AbsImage {
    @Override
    public void parseFile(String fileName) {
        //模拟解析BMP文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMP。");
    }
}
