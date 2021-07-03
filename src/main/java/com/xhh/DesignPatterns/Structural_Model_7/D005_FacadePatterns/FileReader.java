package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;


/**
 * FileReader：文件读取类，充当子系统类。
 */
class FileReader {
    public String read(String fileNameSrc) {
        System.out.print("读取文件【" + fileNameSrc + "】，获取明文: ");
        // 通过流读取内容，省略....
        System.out.println("Hello world!");
        return "Hello world!";
    }
}