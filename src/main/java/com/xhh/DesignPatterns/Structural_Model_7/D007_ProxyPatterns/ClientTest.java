package com.xhh.DesignPatterns.Structural_Model_7.D007_ProxyPatterns;

/**
 *   本实例是保护代理和智能引用代理的应用实例，在代理类ProxySearcher中实现对真实主题类的权限控制和引用计数，
 *
 *   如果需要在访问真实主题时增加新的访问控制机制和新功能，只需增加一个新的代理类，再修改配置文件，在客户端代码中使用新增代理类即可，源代码无须修改，符合开闭原则。
 */
public class ClientTest {

    public static void main(String[] args) {
        /**
         * 针对抽象编程，客户端无须分辨真实主题类和代理类
         */
        ISearcher searcher = new ProxySearcher();
        searcher.doSearch(1, "设计模式");
    }
}
