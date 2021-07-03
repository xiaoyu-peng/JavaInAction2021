package com.xhh.DesignPatterns.Structural_Model_7.D004_DecoratorPatterns;

/**
 * 列表框类：具体构件类
 */
class ListBoxComponent extends Component {

    @Override
    public void display() {
        System.out.println("显示列表框！");
    }

}