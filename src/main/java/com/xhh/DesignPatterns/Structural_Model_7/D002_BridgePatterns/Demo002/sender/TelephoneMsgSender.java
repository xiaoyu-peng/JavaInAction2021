package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender;

import java.util.List;

public class TelephoneMsgSender implements MsgSender {

  private List telephones;

  public TelephoneMsgSender(List telephones) {
    this.telephones = telephones;
  }

  @Override
  public void send(String message) {
    // ...
    System.out.println(message);
  }
}
