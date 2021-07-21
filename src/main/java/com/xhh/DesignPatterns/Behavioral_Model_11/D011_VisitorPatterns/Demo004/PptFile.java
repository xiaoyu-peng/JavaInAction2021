package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo004;

public class PptFile extends ResourceFile {
    public PptFile(String filePath) {
        super(filePath);
    }

    @Override
    public ResourceFileType getType() {
        return ResourceFileType.PPT;
    }

    //...
}