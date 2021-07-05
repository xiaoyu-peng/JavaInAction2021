package com.xhh.DesignPatterns.Behavioral_Model_11.D002_CommondPatterns.command_adder;

class Client {
	public static void main(String args[]) {
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command;
		command = new ConcreteCommand();

		//向发送者注入命令对象
		form.setCommand(command);
		
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();
	}
}