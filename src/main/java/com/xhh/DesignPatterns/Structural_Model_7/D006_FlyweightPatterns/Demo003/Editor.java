package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo003;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Editor {
    private List<Character> chars = new ArrayList<>();

    public void appendCharacter(char c, Font font, int size, int colorRGB) {
        Character character = new Character(c, font, size, colorRGB);
        chars.add(character);
    }
}