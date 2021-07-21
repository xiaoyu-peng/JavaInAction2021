package com.xhh.DesignPatterns.Rebuild_Code.Demo002;

import java.util.List;
import java.util.Map;

public class RedisMetricsStorageImpl implements MetricsStorage {

  /**
   * ...省略属性和构造函数等...
   * @param requestInfo
   */
  @Override
  public void saveRequestInfo(RequestInfo requestInfo) {
    //...
  }

  @Override
  public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
    //...
    return null;
  }

  @Override
  public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
    //...
    return null;
  }
}