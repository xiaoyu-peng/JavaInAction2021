package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Multiplayer;


/**
 * AllyControlCenter充当目标类，ConcreteAllyControlCenter充当具体目标类，Observer充当抽象观察者，Player充当具体观察者
 * <p>
 * 在本实例中，实现了两次对象之间的联动，当一个游戏玩家Player对象的beAttacked()方法被调用时，将调用AllyControlCenter的notifyObserver()方法来进行处理，而在notifyObserver()方法中又将调用其他Player对象的help()方法。
 * <p>
 * Player的beAttacked()方法、AllyControlCenter的notifyObserver()方法以及Player的help()方法构成了一个联动触发链，执行顺序如下所示：
 * <p>
 * Player.beAttacked() --> AllyControlCenter.notifyObserver() -->Player.help()。
 */
class Client {
    public static void main(String args[]) {
        //定义观察目标对象
        AllyControlCenter acc = new ConcreteAllyControlCenter("金庸群侠");

        //定义四个观察者对象
        Observer player1, player2, player3, player4;

        player1 = new Player("杨过");
        acc.join(player1);

        player2 = new Player("令狐冲");
        acc.join(player2);

        player3 = new Player("张无忌");
        acc.join(player3);

        player4 = new Player("段誉");
        acc.join(player4);

        //某成员遭受攻击
        player1.beAttacked(acc);
    }
}