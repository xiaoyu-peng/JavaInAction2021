package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_queue;


/**
 * 在增加了命令队列类CommandQueue以后，请求发送者类Invoker将针对CommandQueue编程
 */
class Invoker {
	private CommandQueue commandQueue; //维持一个CommandQueue对象的引用
	
    //构造注入
	public Invoker(CommandQueue commandQueue) {
		this. commandQueue = commandQueue;
	}
	
    //设值注入
	public void setCommandQueue(CommandQueue commandQueue) {
		this.commandQueue = commandQueue;
	}
	
	//调用CommandQueue类的execute()方法
	public void call() {
		commandQueue.execute();
	}
}