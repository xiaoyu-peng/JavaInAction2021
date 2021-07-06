package com.xhh.DesignPatterns.Behavioral_Model_11.D009_StrategyPatterns.Demo002;

/**
 * 电影票类：环境类
 */
class MovieTicket {

    private double price;
    /**
     * 维持一个对抽象折扣类的引用
     */
    private Discount discount;

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 注入一个折扣类对象
     *
     * @param discount
     */
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}