package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo003;

/**
 * 屏幕类
 */
class Screen {
	/**
	 * 枚举所有的状态，currentState表示当前状态
	 */
	private State currentState, normalState, largerState, largestState;
 
	public Screen() {
		//创建正常状态对象
    	this.normalState = new NormalState();
		//创建二倍放大状态对象
    	this.largerState = new LargerState();
		//创建四倍放大状态对象
    	this.largestState = new LargestState();
		//设置初始状态
    	this.currentState = normalState;
    	this.currentState.display();
	}
	
	public void setState(State state) {
		this.currentState = state;
	}

	/**
	 * 单击事件处理方法，封转了对状态类中业务方法的调用和状态的转换
	 */
	public void onClick() {
    	if (this.currentState == normalState) {
    		this.setState(largerState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largerState) {
    		this.setState(largestState);
    		this.currentState.display();
    	}
    	else if (this.currentState == largestState) {
    		this.setState(normalState);
    		this.currentState.display();
    	}
	}
}

/**
 * 抽象状态类
 */
abstract class State {
	public abstract void display();
}

/**
 * 正常状态类
 */
class NormalState extends State{
	@Override
	public void display() {
		System.out.println("正常大小！");
	}
}

/**
 * 二倍状态类
 */
class LargerState extends State{
	@Override
	public void display() {
		System.out.println("二倍大小！");
	}
}

/**
 * 三倍状态类
 */
class LargestState extends State{
	@Override
	public void display() {
		System.out.println("三倍大小！");
	}
}