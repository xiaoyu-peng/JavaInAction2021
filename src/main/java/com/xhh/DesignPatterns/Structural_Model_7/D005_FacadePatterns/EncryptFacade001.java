package com.xhh.DesignPatterns.Structural_Model_7.D005_FacadePatterns;

/**
 * EncryptFacade：加密外观类，充当外观类。
 */
public class EncryptFacade001 extends AbstractEncryptFacade {

    /**
     * 维持对其他对象的引用
     */
    private FileReader reader;
    private CipherMachine001 cipher;
    private FileWriter writer;

    public EncryptFacade001() {
        reader = new FileReader();
        cipher = new CipherMachine001();
        writer = new FileWriter();
    }

    /**
     * 调用其他对象的业务方法
     * @param fileNameSrc
     * @param fileNameDes
     */
    @Override
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }

}
