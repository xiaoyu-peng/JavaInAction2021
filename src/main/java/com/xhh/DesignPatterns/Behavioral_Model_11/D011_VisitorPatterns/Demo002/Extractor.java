package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002;


public class Extractor {

    public void extract2txt(PptFile pptFile) {
        //...
        System.out.println("Extract PPT.");
    }

    public void extract2txt(PdfFile pdfFile) {
        //...
        System.out.println("Extract PDF.");
    }

    public void extract2txt(WordFile wordFile) {
        //...
        System.out.println("Extract WORD.");
    }
}
