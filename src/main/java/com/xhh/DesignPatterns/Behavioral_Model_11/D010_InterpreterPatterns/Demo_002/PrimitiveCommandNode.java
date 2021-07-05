package com.xhh.DesignPatterns.Behavioral_Model_11.D010_InterpreterPatterns.Demo_002;

/**
 * 基本命令节点类：终结符表达式
 */
class PrimitiveCommandNode extends AbsNode {
	private String name;
	private String text;

	/**
	 * AbsNode
	 * @param context
	 */
	@Override
	public void interpret(Context context) {
		name = context.currentToken();
		context.skipToken(name);
	    if (!name.equals("PRINT") && !name.equals("BREAK") && !name.equals ("SPACE")){
			System.err.println("非法命令！");
		}
		if (name.equals("PRINT")){
			text = context.currentToken();
			context.nextToken();
		}
	}
	
	@Override
	public void execute(){
		if (name.equals("PRINT"))
			System.out.print(text);
		else if (name.equals("SPACE")) {
			System.out.print(" ");
		} else if (name.equals("BREAK")) {
			System.out.println();
		}
	}
}