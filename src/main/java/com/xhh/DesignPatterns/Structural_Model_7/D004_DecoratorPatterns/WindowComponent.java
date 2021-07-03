package com.xhh.DesignPatterns.Structural_Model_7.D004_DecoratorPatterns;

/**
 * 窗体类：具体构件类
 */
class WindowComponent extends Component {

    @Override
    public void display() {
        System.out.println("显示窗体！");
    }

}