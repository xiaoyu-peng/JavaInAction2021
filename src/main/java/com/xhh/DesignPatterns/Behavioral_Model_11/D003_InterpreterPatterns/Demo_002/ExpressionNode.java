package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo_002;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 表达式节点类：非终结符表达式
 */
class ExpressionNode extends AbsNode {

	/**
	 * 定义一个集合用于存储多条命令
	 */
    private ArrayList<AbsNode> list = new ArrayList<AbsNode>();

    @Override
    public void interpret(Context context) {
        //循环处理Context中的标记
        while (true) {
            //如果已经没有任何标记，则退出解释
            if (context.currentToken() == null) {
                break;
            } else if (context.currentToken().equals("END")) {
                //如果标记为END，则不解释END并结束本次解释过程，可以继续之后的解释
                context.skipToken("END");
                break;
            }
            //如果为其他标记，则解释标记并将其加入命令集合
            else {
                AbsNode commandNode = new CommandNode();
                commandNode.interpret(context);
                list.add(commandNode);
            }
        }
    }

	/**
	 * 循环执行命令集合中的每一条命令
	 */
	@Override
	public void execute() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((AbsNode) iterator.next()).execute();
        }
    }
}