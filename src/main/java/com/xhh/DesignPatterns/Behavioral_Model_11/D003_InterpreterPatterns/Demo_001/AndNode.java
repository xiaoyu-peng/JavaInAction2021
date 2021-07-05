package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo_001;

/**
 * And解释：非终结符表达式
 */
class AndNode extends AbstractNode {
    /**
     * And的左表达式
     */
    private AbstractNode left;
    /**
     * And的右表达式
     */
    private AbstractNode right;

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

	/**
	 * And表达式解释操作
	 * @return
	 */
	@Override
	public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}