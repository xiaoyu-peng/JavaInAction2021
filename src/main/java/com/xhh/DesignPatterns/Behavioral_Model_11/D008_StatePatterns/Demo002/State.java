package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo002;

abstract class State {

    public abstract void on(Switch s);

    public abstract void off(Switch s);
}


/**
 * 打开状态
 */
class OnState extends State {
	@Override
	public void on(Switch s) {
		System.out.println("已经打开！");
	}

	@Override
	public void off(Switch s) {
		System.out.println("关闭！");
		s.setState(Switch.getState("off"));
	}
}

/**
 * 关闭状态
 */
class OffState extends State {
	@Override
	public void
	on(Switch s) {
		System.out.println("打开！");
		s.setState(Switch.getState("on"));
	}

	@Override
	public void off(Switch s) {
		System.out.println("已经关闭！");
	}
}