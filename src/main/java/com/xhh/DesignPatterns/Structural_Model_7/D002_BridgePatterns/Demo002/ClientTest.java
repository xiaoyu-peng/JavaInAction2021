package com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002;

import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction.NormalNotification;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.notifaction.Notification;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.MsgSender;
import com.xhh.DesignPatterns.Structural_Model_7.D002_BridgePatterns.Demo002.sender.WechatMsgSender;


/**
 * TODO 在 GoF 的《设计模式》一书中，桥接模式被定义为：“将抽象和实现解耦，让它们可以独立变化。
 *      ”在其他资料和书籍中，还有另外一种更加简单的理解方式：“一个类存在两个（或多个）独立变化的维度，我们通过组合的方式，让这两个（或多个）维度可以独立进行扩展。”
 *
 * TODO 定义中的“抽象”，指的并非“抽象类”或“接口”，而是被抽象出来的一套“类库”，它只包含骨架代码，真正的业务逻辑需要委派给定义中的“实现”来完成。
 *      而定义中的“实现”，也并非“接口的实现类”，而是一套独立的“类库”。
 *      “抽象”和“实现”独立开发，通过对象之间的组合关系，组装在一起。
 *
 * 文中举的警报的例子很贴切。紧急程度和警报的方式可以是两个不同的纬度。可以有不同的组合方式。这与slf4j这一日志门面的设计有异曲同工之妙。
 *
 * slf4j其中有三个核心概念，logger,appender和encoder。分别指这个日志记录器负责哪个类的日志，日志打印到哪里以及日志打印的格式。
 * 三个纬度上可以有不同的实现，使用者可以在每一纬度上定义多个实现，配置文件中将各个纬度的某一个实现组合在一起就ok了。
 *
 * 行文至此，开头的那个问题也有了答案。一句话就是，桥接就是面向接口编程的集大成者。
 * 面向接口编程只是说在系统的某一个功能上将接口和实现解藕，而桥接是详细的分析系统功能，将各个独立的纬度都抽象出来，使用时按需组合。
 */
public class ClientTest {

    public static void main(String[] args) {
        MsgSender sender = new WechatMsgSender();
        Notification notification = new NormalNotification(sender);
        notification.notify("服务报警，请尽快处理！！！");
    }
}
