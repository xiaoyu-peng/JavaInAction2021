package com.xhh.DesignPatterns.Structural_Model_7.D003_CompositePatterns.Demo001;

/**
 * 文本文件类：叶子构件
 */
class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
	public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
	public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
	public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
	public void killVirus() {
        //模拟杀毒
        System.out.println("----对文本文件'" + name + "'进行杀毒");
    }
}