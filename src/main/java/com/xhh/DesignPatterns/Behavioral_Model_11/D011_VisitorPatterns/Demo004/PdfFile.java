package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo004;


public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PDF;
    }

    //...
}