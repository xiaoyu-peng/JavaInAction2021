package com.xhh.DesignPatterns.Behavioral_Model_11.D008_StatePatterns.Demo005;

/**
 * IMario 是状态的接口，定义了所有的事件; 所有状态类的接口
 */
public interface IMario {
  State getName();

  /**
   * 以下是定义的事件
   */
  void obtainMushRoom();
  void obtainCape();
  void obtainFireFlower();
  void meetMonster();
}

