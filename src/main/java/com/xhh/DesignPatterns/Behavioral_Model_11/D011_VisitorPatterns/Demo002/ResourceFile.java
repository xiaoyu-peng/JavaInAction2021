package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002;


public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * 根据不同的文件类型，使用不同的读取算法来读取资源文件
     * @param extractor
     */
    abstract public void accept(Extractor extractor);

    /**
     * 根据不同的文件类型，使用不同的压缩算法来压缩资源文件
     * @param compressor
     */
    abstract public void accept(Compressor compressor);
}