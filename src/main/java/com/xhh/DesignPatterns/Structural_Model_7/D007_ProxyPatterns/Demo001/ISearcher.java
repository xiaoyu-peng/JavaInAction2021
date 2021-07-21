package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns.Demo001;

/**
 * Searcher：抽象查询类，充当抽象主题角色，它声明了doSearch()方法。
 */
interface ISearcher {

    String doSearch(Integer userId, String keyword);
}
