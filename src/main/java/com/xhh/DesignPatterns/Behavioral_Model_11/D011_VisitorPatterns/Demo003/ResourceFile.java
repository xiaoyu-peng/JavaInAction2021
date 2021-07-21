package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo003;


import com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002.Compressor;
import com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo002.Extractor;

public abstract class ResourceFile {

    protected String filePath;

    public ResourceFile(String filePath) {
        this.filePath = filePath;
    }


    abstract public void accept(Visitor visitor);

}