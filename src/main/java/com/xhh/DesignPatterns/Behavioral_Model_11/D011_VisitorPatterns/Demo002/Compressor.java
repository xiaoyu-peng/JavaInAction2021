package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002;


public class Compressor {

    public void compress2txt(PptFile pptFile) {
        //...
        System.out.println("Compress PPT.");
    }

    public void compress2txt(PdfFile pdfFile) {
        //...
        System.out.println("Compress PDF.");
    }

    public void compress2txt(WordFile wordFile) {
        //...
        System.out.println("Compress WORD.");
    }
}
