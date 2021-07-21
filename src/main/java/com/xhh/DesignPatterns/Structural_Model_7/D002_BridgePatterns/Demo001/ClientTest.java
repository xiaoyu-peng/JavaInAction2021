package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.image.AbsImage;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.image.JPGImage;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.imp.ImageImp;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo001.imp.WindowsImp;

public class ClientTest {

    public static void main(String[] args) {

        AbsImage image = new JPGImage();
        ImageImp imageImp = new WindowsImp();

        image.setImageImp(imageImp);
        image.parseFile("小魔女");

    }
}
