package com.xhh.DesignPatterns.D001_SimpleFactory.ex_chart;

/**
 * 具体产品类：饼状图
 */
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }
}
