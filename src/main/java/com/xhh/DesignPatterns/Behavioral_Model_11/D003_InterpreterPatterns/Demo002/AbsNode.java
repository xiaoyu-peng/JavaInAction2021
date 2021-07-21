package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo002;

/**
 * 抽象节点类：抽象表达式
 */
abstract class AbsNode {

	/**
	 * 声明一个方法用于执行标记对应的命令
	 * @param text
	 */
	public abstract void interpret(Context text);

	/**
	 * 声明一个方法用于执行标记对应的命令
	 */
	public abstract void execute();
}