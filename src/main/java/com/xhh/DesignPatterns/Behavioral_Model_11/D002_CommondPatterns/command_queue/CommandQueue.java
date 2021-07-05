package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_queue;


import java.util.*;


/**
 * 将多个请求排队，当一个请求发送者发送一个请求时，将不止一个请求接收者产生响应，这些请求接收者将逐个执行业务方法，完成对请求的处理。此时，我们可以通过命令队列来实现。
 */
class CommandQueue<AbsCommand> {
	/**
	 * 定义一个ArrayList来存储命令队列
	 */
	private ArrayList<AbsCommand> commands = new ArrayList<AbsCommand>();
	
	public void addCommand(AbsCommand command) {
		commands.add(command);
	}
	
	public void removeCommand(AbsCommand command) {
		commands.remove(command);
	}

	/**
	 * 循环调用每一个命令对象的execute()方法
	 */
	public void execute() {
		for (Object command : commands) {
			// ((AbsCommand)command).execute();
		}
	}
}