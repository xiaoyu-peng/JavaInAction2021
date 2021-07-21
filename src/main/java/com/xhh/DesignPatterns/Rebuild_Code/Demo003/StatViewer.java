package com.xhh.DesignPatterns.Rebuild_Code.Demo003;

import java.util.Map;

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}