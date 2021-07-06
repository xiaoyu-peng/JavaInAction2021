package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo003;

/**
 * 屏幕放大镜工具，其具体功能描述如下：用户单击“放大镜”按钮之后屏幕将放大一倍，再点击一次“放大镜”按钮屏幕再放大一倍，第三次点击该按钮后屏幕将还原到默认大小。
 */
class Client {
	public static void main(String args[]) {
		Screen screen = new Screen();
		screen.onClick();
		screen.onClick();
		screen.onClick();
	}
}