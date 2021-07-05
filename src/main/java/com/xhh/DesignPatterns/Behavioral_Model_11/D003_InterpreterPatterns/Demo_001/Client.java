package com.xhh.DesignPatterns.Behavioral_Model_11.D003_InterpreterPatterns.Demo_001;

/**
 * 注：本实例对机器人控制指令的输出结果进行模拟，将英文指令翻译为中文指令，实际情况是调用不同的控制程序进行机器人的控制，包括对移动方向、方式和距离的控制等
 */
class Client {
    public static void main(String args[]) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString = handler.output();
        System.out.println(outString);
    }
}