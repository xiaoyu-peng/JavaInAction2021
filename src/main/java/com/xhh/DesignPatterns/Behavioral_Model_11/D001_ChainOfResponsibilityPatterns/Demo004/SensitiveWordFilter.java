package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns.Demo004;



/**
 * 对于支持 UGC（User Generated Content，用户生成内容）的应用（比如论坛）来说，用户生成的内容（比如，在论坛中发表的帖子）可能会包含一些敏感词（比如涉黄、广告、反动等词汇）。
 *
 * 针对这个应用场景，我们就可以利用职责链模式来过滤这些敏感词。对于包含敏感词的内容，我们有两种处理方式，一种是直接禁止发布，另一种是给敏感词打马赛克（比如，用 *** 替换敏感词）之后再发布。
 *
 * 第一种处理方式符合 GoF 给出的职责链模式的定义，第二种处理方式是职责链模式的变体。
 *
 */
public interface SensitiveWordFilter {
    boolean doFilter(String content);
}