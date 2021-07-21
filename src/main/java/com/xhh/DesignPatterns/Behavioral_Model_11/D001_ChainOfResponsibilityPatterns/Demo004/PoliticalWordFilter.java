package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns.Demo004;

/**
 * 实现接口
 */
public class PoliticalWordFilter implements SensitiveWordFilter {

    @Override
    public boolean doFilter(String content) {
        boolean legal = true;
        //...
        return legal;
    }

}