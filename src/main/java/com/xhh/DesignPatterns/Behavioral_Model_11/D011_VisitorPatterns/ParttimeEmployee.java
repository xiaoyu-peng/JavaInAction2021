package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 兼职员工类：具体元素类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class ParttimeEmployee implements Employee {

    private String name;
    private double hourWage;
    private int workTime;

    /**
     * 接受一个抽象访问者访问
     *
     * @param handler
     */
    @Override
    public void accept(Department handler) {
        //调用访问者的访问方法
        handler.visit(this);
    }
}
