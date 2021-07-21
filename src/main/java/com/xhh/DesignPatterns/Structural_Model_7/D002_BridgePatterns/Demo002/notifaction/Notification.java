package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.MsgSender;

public abstract class Notification {
  protected MsgSender msgSender;

  public Notification(MsgSender msgSender) {
    this.msgSender = msgSender;
  }

  public abstract void notify(String message);
}
