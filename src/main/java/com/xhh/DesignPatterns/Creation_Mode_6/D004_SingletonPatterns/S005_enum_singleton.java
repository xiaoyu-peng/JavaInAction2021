package com.xhh.DesignPatterns.Creation_Mode_6.D004_SingletonPatterns;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 基于枚举实现单例模式
 *
 * <p>通过java枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性
 */
public enum S005_enum_singleton {
  INSTANCE;
  private AtomicLong id = new AtomicLong(0);

  public long getId() {
    return id.incrementAndGet();
  }
}
