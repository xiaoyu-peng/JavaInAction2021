package com.xhh.DesignPatterns.Rebuild_Code.Demo003;

import com.xhh.DesignPatterns.Rebuild_Code.Demo002.RequestInfo;

import java.util.List;
import java.util.Map;

public interface MetricsStorage {

    void saveRequestInfo(com.xhh.DesignPatterns.Rebuild_Code.Demo002.RequestInfo requestInfo);

    List<com.xhh.DesignPatterns.Rebuild_Code.Demo002.RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}

