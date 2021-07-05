package com.xhh.DesignPatterns.Behavioral_Model_11.D005_MediatorPatterns;


/**
 * 抽象组件类：抽象同事类
 */
abstract class Component {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void updateOP();
}


/**
 * 按钮类：具体同事类
 */
class Button extends Component {
    @Override
    public void updateOP() {
        //按钮不产生交互
    }
}

/**
 * 列表框类：具体同事类
 */
class List extends Component {
    @Override
    public void updateOP() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void selectOP() {
        System.out.println("列表框选中项：小龙女。");
    }
}

/**
 * 组合框类：具体同事类
 */
class ComboBox extends Component {
    @Override
    public void updateOP() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void selectOP() {
        System.out.println("组合框选中项：小龙女。");
    }
}

/**
 * 文本框类：具体同事类
 */
class TextBox extends Component {
    @Override
    public void updateOP() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}

/**
 * 新增项
 * 文本标签类：具体同事类
 */
class Label extends Component {
    @Override
    public void updateOP() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}
