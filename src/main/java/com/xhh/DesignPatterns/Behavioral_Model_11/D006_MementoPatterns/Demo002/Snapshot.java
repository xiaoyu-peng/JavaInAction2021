package com.xhh.DesignPatterns.Behavioral_Model_11.D006_MementoPatterns.Demo002;

public class Snapshot {
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}