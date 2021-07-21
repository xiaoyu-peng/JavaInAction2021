package com.xhh.DesignPatterns.Structural_Model_7.D006_FlyweightPatterns.Demo002;

/**
 * 象棋使用享元模式实现
 * <p>
 * TODO 案例：
 * 为了记录每个房间当前的棋局情况，我们需要给每个房间都创建一个 ChessBoard 棋局对象。
 * 因为游戏大厅中有成千上万的房间（实际上，百万人同时在线的游戏大厅也有很多），那保存这么多棋局对象就会消耗大量的内存。有没有什么办法来节省内存呢？
 * <p>
 * TODO 方案：享元模式
 * 我们利用工厂类来缓存 ChessPieceUnit 信息（也就是 id、text、color）。
 * 通过工厂类获取到的 ChessPieceUnit 就是享元，所有的 ChessBoard 对象共享这 30 个 ChessPieceUnit 对象（因为象棋中只有 30 个棋子）。
 * 在使用享元模式之前，记录 1 万个棋局，我们要创建 30 万（30*1 万）个棋子的 ChessPieceUnit 对象。利用享元模式，我们只需要创建 30 个享元对象供所有棋局共享使用即可，大大节省了内存。
 */
public class ClientTest {
}
