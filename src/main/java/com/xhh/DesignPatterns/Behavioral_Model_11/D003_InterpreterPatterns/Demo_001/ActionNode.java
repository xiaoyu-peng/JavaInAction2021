package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo_001;

/**
 * 动作解释：终结符表达式
 */
class ActionNode extends AbstractNode {
	private String action;
	
	public ActionNode(String action) {
		this.action = action;
	}

	/**
	 * 动作（移动方式）表达式的解释操作
	 * @return
	 */
	public String interpret() {
		if (action.equalsIgnoreCase("move")) {
			return "移动";
		}
		else if (action.equalsIgnoreCase("run")) {
			return "快速移动";
		}
		else {
			return "无效指令";
		}
	}
}