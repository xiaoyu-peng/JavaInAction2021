package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.MsgSender;

public class NormalNotification extends Notification {
    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        // 与SevereNotification代码结构类似，所以省略...
        msgSender.send(message);
    }
}
