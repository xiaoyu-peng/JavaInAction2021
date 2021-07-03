package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;

/**
 * FileWriter：文件保存类，充当子系统类。
 */
public class FileWriter {

    public void write(String encryptStr, String fileNameDes) {
        // 通过流写入文件，省略....
        System.out.println("保存密文，写入文件 "+ fileNameDes);
    }
}
