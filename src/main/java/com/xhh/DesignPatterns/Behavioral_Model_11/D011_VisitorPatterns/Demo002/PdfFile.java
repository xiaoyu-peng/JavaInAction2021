package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002;


public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Extractor extractor) {
        extractor.extract2txt(this);
    }

    /**
     * 根据不同的文件类型，使用不同的压缩算法来压缩资源文件
     *
     * @param compressor
     */
    @Override
    public void accept(Compressor compressor) {
        compressor.compress2txt(this);
    }
    //...
}