package com.xhh.DesignPatterns.D001_SimpleFactory.ex_chart;


class TestClient {
    public static void main(String args[]) {
        Chart chart;
        //读取配置文件中的参数
        String type = XMLUtil.getChartType();
        //创建产品对象
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}