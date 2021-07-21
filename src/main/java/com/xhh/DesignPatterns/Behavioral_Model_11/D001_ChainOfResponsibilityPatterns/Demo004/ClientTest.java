package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns.Demo004;

public class ClientTest {

    public static void main(String[] args) {
        SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
        filterChain.addFilter(new AdsWordFilter());
        filterChain.addFilter(new SexyWordFilter());
        filterChain.addFilter(new PoliticalWordFilter());
        boolean legal = filterChain.filter("河南加油！！！郑州加油！！！");
        if (!legal) {
            // 不发表
        } else {
            // 发表
        }
    }
}
