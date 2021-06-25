package com.xhh.DesignPatterns.D002_StrategyPatterns;

public class TestMain {

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
