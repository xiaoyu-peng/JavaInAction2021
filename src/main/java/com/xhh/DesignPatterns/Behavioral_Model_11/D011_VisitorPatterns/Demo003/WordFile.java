package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo003;


public class WordFile extends ResourceFile {

    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    //...
}