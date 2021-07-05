package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_logger;

/**
 * 修改命令类：具体命令
 */
class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
	public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
	public void execute() {
        configOperator.modify(this.args);
    }
}