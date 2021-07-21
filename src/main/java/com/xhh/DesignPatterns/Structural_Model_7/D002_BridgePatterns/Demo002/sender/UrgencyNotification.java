package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction.Notification;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.MsgSender;

public class UrgencyNotification extends Notification {
  public UrgencyNotification(MsgSender msgSender) {
    super(msgSender);
  } // 与SevereNotification代码结构类似，所以省略...}

  @Override
  public void notify(String message) {
    System.out.println(message);
  }
}
