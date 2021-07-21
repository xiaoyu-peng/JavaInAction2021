package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo001;

import java.util.ArrayList;

/**
 * 员工列表类：对象结构
 */
class EmployeeList {
    /**
     * 定义一个集合用于存储员工对象
     */
    private ArrayList<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    /**
     * 遍历访问员工集合中的每一个员工对象
     *
     * @param handler
     */
    public void accept(Department handler) {
        for (Object obj : list) {
            ((Employee) obj).accept(handler);
        }
    }
}