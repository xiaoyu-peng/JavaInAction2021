package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_adder;

/**
 * 抽象命令类
 */
abstract class AbstractCommand {

	/**
	 * 声明命令执行方法execute()
	 * @param value
	 * @return
	 */
    public abstract int execute(int value);

    public abstract int undo(); //声明撤销方法undo()
}
