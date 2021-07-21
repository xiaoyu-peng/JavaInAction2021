package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo001;

/**
 * 简单句子解释：非终结符表达式
 */
class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

	/**
	 * 简单句子解释：非终结符表达式
	 * @return
	 */
	@Override
	public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
