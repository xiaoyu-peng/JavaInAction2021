package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;

/**
 * CipherMachine：数据加密类，充当子系统类。
 */
public class CipherMachine002 {

    public String encrypt(String plainText) {
        System.out.print("采用<---移位运算--->数据加密，将明文【" + plainText + "】转换为秘文：");
        System.out.println("ZH#DAL@FA!!F");
        return "ZH#DAL@FA!!F";
    }

}
