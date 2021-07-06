package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.Multiplayer;

/**
 * 抽象观察类
 */
interface Observer {

    public String getName();

    public void setName(String name);

    /**
     * 声明支援盟友方法
     */
    public void help();

    /**
     * /声明遭受攻击方法
     *
     * @param acc
     */
    public void beAttacked(AllyControlCenter acc);

}