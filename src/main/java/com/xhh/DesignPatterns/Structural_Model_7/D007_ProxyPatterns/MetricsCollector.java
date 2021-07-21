package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

import org.apache.commons.lang.StringUtils;

/**
 * 【划分类的职责】
 *
 * <p>1）MetricsCollector 类负责提供 API，来采集接口请求的原始数据。我们可以为 MetricsCollector 抽象出一个接口，但这并不是必须的，因为暂时我们只能想到一个
 * MetricsCollector 的实现方式。 2）MetricsStorage 接口负责原始数据存储，RedisMetricsStorage 类实现 MetricsStorage
 * 接口。这样做是为了今后灵活地扩展新的存储方法，比如用 HBase 来存储。 3）Aggregator 类负责根据原始数据计算统计数据。 4）ConsoleReporter
 * 类、EmailReporter 类分别负责以一定频率统计并发送统计数据到命令行和邮件。
 */
public class MetricsCollector {

  /** 基于接口而非实现编程 */
  private MetricsStorage metricsStorage;

  public MetricsCollector() {}

  /** @param metricsStorage */
  public MetricsCollector(MetricsStorage metricsStorage) {
    this.metricsStorage = metricsStorage;
  }

  /** @param requestInfo */
  public void recordRequest(RequestInfo requestInfo) {
    if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
      return;
    }
    metricsStorage.saveRequestInfo(requestInfo);
  }
}
