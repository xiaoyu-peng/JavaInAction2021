package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo001;

public class RealSearcher implements ISearcher {

    /**
     * 模拟查询商务信息
     *
     * @param userId
     * @param keyword
     * @return
     */
    @Override
    public String doSearch(Integer userId, String keyword) {
        // 使用关键词搜索，查询上午信息
        System.out.println("用户'" + userId + "'使用关键词'" + keyword + "'查询上午信息！");
        return "商务信息001";
    }
}
