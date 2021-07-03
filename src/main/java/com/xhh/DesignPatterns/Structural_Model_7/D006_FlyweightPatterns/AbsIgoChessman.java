package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns;

/**
 * 围棋棋子：抽象享元类
 */
abstract class AbsIgoChessman {

    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }

    public void display(Coordinates coord) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY());
    }
}
