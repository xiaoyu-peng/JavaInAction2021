package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns;

/**
 * 部门类：抽象访问者类
 */
abstract class Department {

	/**
	 * 声明一组重载的访问方法，用于访问不同类型的具体元素
	 * @param employee
	 */
	public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}
