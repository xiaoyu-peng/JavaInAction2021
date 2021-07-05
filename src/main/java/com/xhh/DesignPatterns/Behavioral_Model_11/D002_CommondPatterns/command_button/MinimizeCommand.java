package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_button;


/**
 * 最小化命令类：具体命令类
 */
class MinimizeCommand extends AbsCommand {

	/**
	 * 维持对请求接收者的引用
	 */
	private WindowHanlder whObj;

	public MinimizeCommand() {
		whObj = new WindowHanlder();
	}

	/**
	 * 命令执行方法，将调用请求接收者的业务方法
	 */
	@Override
	public void execute() {
		whObj.minimize();
	}

}