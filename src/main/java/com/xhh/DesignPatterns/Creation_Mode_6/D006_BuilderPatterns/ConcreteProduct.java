package com.xhh.DesignPatterns.Creation_Mode_6.D006_BuilderPatterns;

/**
 * 具体建造者
 *
 * 注意： 如果有多个产品类就有几个具体的建造者
 */
public class ConcreteProduct extends Builder{

    private Product product = new Product();
    /**
     * 设置产品零件
     */
    @Override
    public void setPart() {
        /**
         * 产品类内的逻辑处理
         */
    }

    /**
     * 如果建造一个产品
     */
    @Override
    public Product buildProduct() {
        return product;
    }
}
