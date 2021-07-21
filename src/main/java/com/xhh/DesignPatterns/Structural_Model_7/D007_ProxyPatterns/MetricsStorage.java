package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

import java.util.List;
import java.util.Map;

public interface MetricsStorage {

  void saveRequestInfo(RequestInfo requestInfo);

  List<com.xhh.DesignPatterns.Rebuild_Code.Demo002.RequestInfo> getRequestInfos(
      String apiName, long startTimeInMillis, long endTimeInMillis);

  Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
