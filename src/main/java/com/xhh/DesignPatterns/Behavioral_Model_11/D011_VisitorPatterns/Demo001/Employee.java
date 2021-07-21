package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo001;

/**
 * 员工类：抽象元素类
 */
interface Employee {
    /**
     * 接受一个抽象访问者访问
     *
     * @param handler
     */
    public void accept(Department handler);
}
