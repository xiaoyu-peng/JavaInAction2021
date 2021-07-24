package com.xhh.DesignPatterns.Behavioral_Model_11.D007_ObserverPatterns.EventBus;

import com.google.common.annotations.Beta;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Subscribe 是一个注解，用于标明观察者中的哪个函数可以接收消息。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Beta
public @interface Subscribe {
}