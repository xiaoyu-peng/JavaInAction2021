package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo002;

/**
 * 如果某系统要求两个开关对象要么都处于开的状态，要么都处于关的状态，在使用时它们的状态必须保持一致，开关可以由开转换到关，也可以由关转换到开。
 */
class Client {
	public static void main(String args[]) {
		Switch s1,s2;
		s1=new Switch("开关1");
		s2=new Switch("开关2");
		
		s1.on();
		s2.on();
		s1.off();
		s2.off();
		s2.on();
		s1.on();	
	}
}