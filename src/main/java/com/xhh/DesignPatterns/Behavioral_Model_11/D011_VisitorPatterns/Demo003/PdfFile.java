package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo003;


import com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002.Extractor;

public class PdfFile extends ResourceFile {
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //...
}