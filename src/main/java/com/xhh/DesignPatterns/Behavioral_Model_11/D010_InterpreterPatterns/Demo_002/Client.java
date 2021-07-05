package com.xhh.DesignPatterns.Behavioral_Model_11.D010_InterpreterPatterns.Demo_002;

/**
 * Context充当环境角色，Node充当抽象表达式角色，ExpressionNode、CommandNode和LoopCommandNode充当非终结符表达式角色，PrimitiveCommandNode充当终结符表达式角色
 */
public class Client {

    public static void main(String[] args) {
        String text = "LOOP 2 PRINT 杨过 SPACE SPACE PRINT 小龙女 BREAK END PRINT 郭靖 SPACE SPACE PRINT 黄蓉";
        Context context = new Context(text);

        AbsNode node = new ExpressionNode();
        node.interpret(context);
        node.execute();
    }
}
