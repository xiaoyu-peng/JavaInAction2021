package com.xhh.DesignPatterns.Behavioral_Model_11.D005_MediatorPatterns.Demo001;


/**
 * 具体中介者
 */
class ConcreteMediator extends Mediator {

	/**
	 * 维持对各个同事对象的引用
	 */
	public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

	/**
	 * 封装同事对象之间的交互
	 * @param c
	 */
	@Override
	public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.updateOP();
            cb.updateOP();
            userNameTextBox.updateOP();
        }
        //从列表框选择客户
        else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.selectOP();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.selectOP();
            userNameTextBox.setText();
        }
    }
}
