package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_chart;

/**
 * 图表工厂类：工厂类
 */
class ChartFactory {

    /**
     * 静态工厂方法
     * @param type
     * @return
     */
    public static IChart getChart(String type) {
        IChart chart = null;
        if ("histogram".equalsIgnoreCase(type)) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if ("pie".equalsIgnoreCase(type)) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        } else if ("line".equalsIgnoreCase(type)) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        } else {
            System.out.println("Error UnSupportedShapeException");
        }
        return chart;
    }

}