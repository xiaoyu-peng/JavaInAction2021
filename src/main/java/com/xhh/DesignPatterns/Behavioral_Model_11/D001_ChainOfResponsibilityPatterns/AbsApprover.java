package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns;

/**
 * 审批者类：抽象处理者
 */
abstract class AbsApprover {

    /**
     * 定义后继对象
     */
    protected AbsApprover successor;

    /**
     * 审批者姓名
     */
    protected String name;

    public AbsApprover(String name) {
        this.name = name;
    }

    /**
     * 设置后继者
     * @param successor
     */
    public void setSuccessor(AbsApprover successor) {
        this.successor = successor;
    }

    /**
     * 抽象请求处理方法
     * @param request
     */
    public abstract void processRequest(PurchaseRequest request);

}
