package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender;

/**
 * 【案例】 API 接口监控告警的例子：根据不同的告警规则，触发不同类型的告警。
 *         告警支持多种通知渠道，包括：邮件、短信、微信、自动语音电话。
 *         通知的紧急程度有多种类型，包括：SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要）。
 *         不同的紧急程度对应不同的通知渠道。比如，SERVE（严重）级别的消息会通过“自动语音电话”告知相关人员。
 */
public interface MsgSender {
  void send(String message);
}
