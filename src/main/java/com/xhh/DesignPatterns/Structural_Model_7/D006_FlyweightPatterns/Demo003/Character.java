package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo003;

import java.awt.*;

public class Character {
    //文字
    private char c;
    private Font font;
    private int size;
    private int colorRGB;

    public Character(char c, Font font, int size, int colorRGB) {
        this.c = c;
        this.font = font;
        this.size = size;
        this.colorRGB = colorRGB;
    }
}