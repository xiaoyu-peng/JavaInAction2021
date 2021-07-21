package com.xhh.DesignPatterns.Behavioral_Model_11.D004_IteratorPatterns.Demo001;

import java.util.List;

/**
 * 商品数据类：具体聚合类
 */
class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

	/**
	 * 实现创建迭代器对象的具体工厂方法
	 * @return
	 */
	@Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}