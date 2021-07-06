package com.xhh.DesignPatterns.Behavioral_Model_11.D009_StrategyPatterns.Demo001;

public class TestMain {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
