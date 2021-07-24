package com.xhh.DesignPatterns.Behavioral_Model_11.D005_MediatorPatterns.Demo001;

/**
 * 新增具体中介者类
 */
class SubConcreteMediator extends ConcreteMediator {

	/**
	 * 增加对Label对象的引用
	 */
	public Label label;

    @Override
	public void componentChanged(Component c) {
        //单击按钮
        if (c == addButton) {
            System.out.println("--单击增加按钮--");
            list.updateOP();
            cb.updateOP();
            userNameTextBox.updateOP();
            label.updateOP(); //文本标签更新
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