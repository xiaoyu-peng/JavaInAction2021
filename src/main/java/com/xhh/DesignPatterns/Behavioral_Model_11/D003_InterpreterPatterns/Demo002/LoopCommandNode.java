package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo002;

/**
 * 循环命令节点类：非终结符表达式
 */
class LoopCommandNode extends AbsNode {

	/**
	 * 循环次数
	 */
	private int number;
	/**
	 * 循环语句中的表达式
	 */
	private AbsNode commandNode;
	
    //解释循环命令
	@Override
	public void interpret(Context context) {
		context.skipToken("LOOP");
		number = context.currentNumber();
		context.nextToken();
		//循环语句中的表达式
		commandNode = new ExpressionNode();
		commandNode.interpret(context);
	}
	
	@Override
	public void execute() {
		for (int i=0;i<number;i++) {
			commandNode.execute();
		}
	}
}