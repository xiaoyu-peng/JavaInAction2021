package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_chart;

/**
 * 具体产品类：柱形图
 *
 * @author PengHui
 */
public class HistogramChart implements IChart {

    public HistogramChart() {
        System.out.println("创建柱形图");
    }

    @Override
    public void display() {
        System.out.println("创建柱形图！");
    }
}
