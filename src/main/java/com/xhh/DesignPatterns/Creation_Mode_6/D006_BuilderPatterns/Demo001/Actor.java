package com.xhh.DesignPatterns.Creation_Mode_6.D006_BuilderPatterns.Demo001;

import lombok.Data;

/**
 *
 * TODO ActorController充当指挥者，ActorBuilder充当抽象建造者，HeroBuilder、AngelBuilder和DevilBuilder充当具体建造者，Actor充当复杂产品
 *
 * Actor角色类：复杂产品，考虑到代码的可读性，只列出部分成员属性，且成员属性的类型均为String，真实情况下，有些成员属性的类型需自定义
 */
@Data
public class Actor {

    /**
     * 角色类型
     */
    private String type;
    /**
     * 性别
     */
    private String sex;
    /**
     * 脸型
     */
    private String face;
    /**
     * 服装
     */
    private String costume;
    /**
     * 发型
     */
    private String hairstyle;

}
