package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns;

/**
 * 抽象文件夹：抽象构件
 *
 * 提供默认实现的抽象构建类
 */
abstract class AbstractFile {

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public abstract void killVirus();
}
