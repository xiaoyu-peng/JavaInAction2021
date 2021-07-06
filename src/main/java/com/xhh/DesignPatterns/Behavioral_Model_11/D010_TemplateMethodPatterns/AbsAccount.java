package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns;

import org.apache.commons.lang.StringUtils;

import java.io.Console;

abstract class AbsAccount {

    /**
     * 基本方法——具体方法
     */
    public boolean validate(String account, String password) {
        //模拟登陆
        System.out.println("账号："+ account);
        System.out.println("密码："+ password);
        return account.equals("张三") && password.equals("123456");
    }

    /**
     * 基本方法——抽象方法
     */
    public abstract void calculateInterest();

    /**
     * 基本方法——具体方法
     *
     */
    public void display() {
        System.out.println("显示利息！");
    }

    /**
     * 模板方法
     *
     * @param account
     * @param password
     */
    public void Handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }
}


class CurrentAccount extends AbsAccount{
    /**
     * 覆盖父类的抽象基本方法
     */
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}

class SavingAccount extends AbsAccount{
    /**
     * 覆盖父类的抽象基本方法
     */
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}

