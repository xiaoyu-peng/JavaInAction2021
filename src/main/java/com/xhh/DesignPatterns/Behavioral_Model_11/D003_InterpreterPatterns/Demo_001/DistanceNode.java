package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo_001;

/**
 * 距离解释：终结符表达式
 */
class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

	/**
	 * 距离表达式的解释操作
	 * @return
	 */
	@Override
	public String interpret() {
        return this.distance;
    }
}