package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 坐标类，外部状态类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coordinates {

    private int x;
    private int y;
}
