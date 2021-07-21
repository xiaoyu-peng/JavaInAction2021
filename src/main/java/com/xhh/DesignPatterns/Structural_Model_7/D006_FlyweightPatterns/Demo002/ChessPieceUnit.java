package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo002;

/**
 * 享元类
 */
public class ChessPieceUnit {

    private int id;
    private String text;
    private Color color;

    public ChessPieceUnit(int id, String text, Color color) {
        this.id = id;
        this.text = text;
        this.color = color;
    }

    /**
     * ...省略其他属性和getter方法...
     */
    public static enum Color {RED, BLACK}
}
