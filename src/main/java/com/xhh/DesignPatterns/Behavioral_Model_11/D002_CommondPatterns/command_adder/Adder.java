package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_adder;

/**
 * 加法类：请求接收者
 */
class Adder {

	/**
	 * 定义初始值为0
	 */
	private int num=0;

	/**
	 * 加法操作，每次将传入的值与num作加法运算，再将结果返回
	 * @param value
	 * @return
	 */
	public int add(int value) {
		num += value;
		return num;
	}
}
