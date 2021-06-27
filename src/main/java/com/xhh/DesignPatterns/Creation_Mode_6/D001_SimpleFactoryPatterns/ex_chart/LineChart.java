package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_chart;

/**
 * 具体产品类：折线图类
 */
class LineChart implements IChart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    @Override
    public void display() {
        System.out.println("显示折线图！");
    }
}