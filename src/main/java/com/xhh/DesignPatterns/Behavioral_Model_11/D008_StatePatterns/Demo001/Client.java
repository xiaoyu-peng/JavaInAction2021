package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo001;

/**
 * Sunny软件公司开发人员使用状态模式来解决账户状态的转换问题，客户端只需要执行简单的存款和取款操作，系统根据余额将自动转换到相应的状态
 * <p>
 * Account充当环境类角色，AccountState充当抽象状态角色，NormalState、OverdraftState和RestrictedState充当具体状态角色。
 */
class Client {
    public static void main(String args[]) {
        Account acc = new Account("段誉", 0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}