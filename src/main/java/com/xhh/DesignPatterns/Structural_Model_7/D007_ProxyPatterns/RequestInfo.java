package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestInfo {
  private String apiName;
  private double responseTime;
  private long timestamp;
  //...省略constructor/getter/setter方法...
}