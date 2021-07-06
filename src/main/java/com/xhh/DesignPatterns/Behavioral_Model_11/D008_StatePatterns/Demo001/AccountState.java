package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo001;

/**
 * 抽象状态类
 */
abstract class AccountState {

    protected Account acc;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();
}

