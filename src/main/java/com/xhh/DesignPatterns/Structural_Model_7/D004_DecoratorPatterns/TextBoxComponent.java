package com.xhh.DesignPatterns.Structural_Model_7.D004_DecoratorPatterns;

/**
 * 文本框类：具体构件类
 */
class TextBoxComponent extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框！");
    }

}