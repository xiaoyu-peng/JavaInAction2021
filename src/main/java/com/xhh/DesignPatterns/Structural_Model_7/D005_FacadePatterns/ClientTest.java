package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;

public class ClientTest {
    public static void main(String[] args) {
        AbstractEncryptFacade encryptFacade = new EncryptFacade001();
        encryptFacade.fileEncrypt("src.txt", "des.txt");

        System.out.println("-------------分割线-------------");

        AbstractEncryptFacade encryptFacade002 = new EncryptFacade002();
        encryptFacade002.fileEncrypt("src.txt", "des.txt");
    }

}
