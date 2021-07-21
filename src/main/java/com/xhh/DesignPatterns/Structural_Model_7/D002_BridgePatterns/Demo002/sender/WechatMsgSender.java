package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender;

public class WechatMsgSender implements MsgSender {
    @Override
    public void send(String message) {
        // 与TelephoneMsgSender代码结构类似，所以省略...
        System.out.println(message);
    }
}
