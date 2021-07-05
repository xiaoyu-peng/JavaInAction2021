package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_button;


/**
 * 帮助命令类：具体命令类
 */
class HelpCommand extends AbsCommand {

    /**
     * 维持对请求接收者的引用
     */
    private HelpHandler hhObj;

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    /**
     * 命令执行方法，将调用请求接收者的业务方法
     */
    public void execute() {
        hhObj.display();
    }

}