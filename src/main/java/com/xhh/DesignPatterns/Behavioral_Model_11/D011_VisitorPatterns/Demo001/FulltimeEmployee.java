package com.xhh.DesignPatterns.Behavioral_Model_11.D011_VisitorPatterns.Demo001;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 全职员工类：具体元素类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
class FulltimeEmployee implements Employee {

    private String name;
    private double weeklyWage;
    private int workTime;

    @Override
    public void accept(Department handler) {
        //调用访问者的访问方法
        handler.visit(this);
    }
}
