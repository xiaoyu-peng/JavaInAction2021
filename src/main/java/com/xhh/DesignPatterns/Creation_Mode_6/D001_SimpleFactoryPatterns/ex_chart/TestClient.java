package com.xhh.DesignPatterns.Creation_Mode_6.D001_SimpleFactoryPatterns.ex_chart;


import com.xhh.utils.XMLUtil;

class TestClient {
    public static void main(String args[]) {
        IChart chart;
        //读取配置文件中的参数
        String type = XMLUtil.getNodeValue("chartType", 0);
        //创建产品对象
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}