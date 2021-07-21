package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns.Demo001;

/**
 * 抽象模板类
 */
public abstract class AbstractClass {

    /**
     * 基本方法
     */
    protected abstract void doSomething();
    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    public void templateMethod(){
        /**
         * 调用基本方法，完成顺序性的相关逻辑
         */
        this.doAnything();
        this.doSomething();
    }

}
