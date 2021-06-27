package com.xhh.DesignPatterns.D001_SimpleFactoryPatterns.ex_chart;

/**
 * 具体产品类：柱形图
 *
 * @author PengHui
 */
public class HistogramChart implements Chart {

    public HistogramChart() {
        System.out.println("创建柱形图");
    }

    @Override
    public void display() {
        System.out.println("创建柱形图！");
    }
}
