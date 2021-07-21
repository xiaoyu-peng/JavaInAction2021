package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo003;

public interface Visitor {

    void visit(PdfFile pdfFile);

    void visit(PptFile pptFile);

    void visit(WordFile wordFile);
}