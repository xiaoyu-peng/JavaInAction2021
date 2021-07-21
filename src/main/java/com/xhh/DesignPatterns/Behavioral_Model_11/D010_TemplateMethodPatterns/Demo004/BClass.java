package com.xhh.DesignPatterns.Behavioral_Model_11.D010_TemplateMethodPatterns.Demo004;

public class BClass {
  public void process(ICallback callback) {
    //...
    callback.methodToCallback();
    //...
  }
}