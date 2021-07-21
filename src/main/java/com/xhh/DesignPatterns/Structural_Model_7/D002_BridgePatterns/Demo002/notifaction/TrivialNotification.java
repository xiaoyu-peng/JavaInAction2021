package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction.Notification;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.MsgSender;

public class TrivialNotification extends Notification {

    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
