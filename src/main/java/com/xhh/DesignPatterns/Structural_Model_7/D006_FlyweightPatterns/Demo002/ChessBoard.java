package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo002;

import java.util.HashMap;
import java.util.Map;

/**
 * 棋局
 */
public class ChessBoard {
    private Map chessPieces = new HashMap<>();

    public ChessBoard() {
        init();
    }

    private void init() {
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(1), 0, 0));
        chessPieces.put(1, new ChessPiece(ChessPieceUnitFactory.getChessPiece(2), 1, 0));
        //...省略摆放其他棋子的代码...
    }

    public void move(int chessPieceId, int toPositionX, int toPositionY) {
        //...省略...
    }
}