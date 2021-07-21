package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo003;

public class Extractor implements Visitor{
    @Override
    public void visit(PdfFile pdfFile) {
        // ...
        System.out.println("Extract PDF");
    }

    @Override
    public void visit(PptFile pdfFile) {
        // ...
        System.out.println("Extract PDF");

    }

    @Override
    public void visit(WordFile wordFile) {
        // ...
        System.out.println("Extract WORD");
    }
}
