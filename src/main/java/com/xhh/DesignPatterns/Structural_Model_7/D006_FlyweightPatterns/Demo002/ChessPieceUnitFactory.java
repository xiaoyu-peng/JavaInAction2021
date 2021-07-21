package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo002;

import java.util.HashMap;
import java.util.Map;

/**
 * 工厂类 缓存ChessPieceUnit信息
 */
public class ChessPieceUnitFactory {

    /**
     * 码实现非常简单，主要是通过工厂模式，在工厂类中，通过一个 Map 来缓存已经创建过的享元对象，来达到复用的目的。
     */
    private static final Map pieces = new HashMap<>();

    static {
        pieces.put(1, new ChessPieceUnit(1, "車", ChessPieceUnit.Color.BLACK));
        pieces.put(2, new ChessPieceUnit(2, "馬", ChessPieceUnit.Color.BLACK));
        //...省略摆放其他棋子的代码...
    }

    public static ChessPieceUnit getChessPiece(int chessPieceId) {
        return (ChessPieceUnit) pieces.get(chessPieceId);
    }
}