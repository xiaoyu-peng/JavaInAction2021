package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Multiplayer;

import java.util.ArrayList;

/**
 * 战队控制中心类：目标类
 */
abstract class AllyControlCenter {

    /**
     * 战队名称
     */
    protected String allyName;
    /**
     * 定义一个集合用于存储战队成员
     */
    protected ArrayList<Observer> players = new ArrayList<Observer>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    /**
     * 注册方法
     *
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队！");
        players.add(obs);
    }

    /**
     * 注销方法
     *
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队！");
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     *
     * @param name
     */
    public abstract void notifyObserver(String name);
}