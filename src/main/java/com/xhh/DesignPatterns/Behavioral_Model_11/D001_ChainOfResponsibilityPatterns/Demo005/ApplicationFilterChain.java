package com.xhh.DesignPatterns.Behavioral_Model_11.D001_ChainOfResponsibilityPatterns.Demo005;


import org.apache.catalina.core.ApplicationFilterConfig;

import javax.servlet.*;
import java.io.IOException;

public final class ApplicationFilterChain implements FilterChain {

    /**
     * 当前执行到了哪个filter
     */
    private int pos = 0;
    /**
     * filter的个数
     */
    private int n;
    private ApplicationFilterConfig[] filters;
    private Servlet servlet;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            //TODO  Filter filter = filterConfig.getFilter();
            //TODO  filter.doFilter(request, response, this);
        } else {
            // filter都处理完毕后，执行servlet
            servlet.service(request, response);
        }
    }

    public void doFilter2(ServletRequest request, ServletResponse response) {
        if (pos < n) {
            ApplicationFilterConfig filterConfig = filters[pos++];
            //TODO  Filter filter = filterConfig.getFilter();
            //filter.doFilter(request, response, this);

            //TODO  把filter.doFilter的代码实现展开替换到这里
            System.out.println("拦截客户端发送来的请求.");

            // chain就是this
            //TODO  chain.doFilter(request, response);

            System.out.println("拦截发送给客户端的响应.");
        } else { // filter都处理完毕后，执行servlet
            // servlet.service(request, response);
        }
    }

    public void addFilter(ApplicationFilterConfig filterConfig) {
        for (ApplicationFilterConfig filter : filters) {
            if (filter == filterConfig) {
                return;
            }
        }

        //扩容
        if (n == filters.length) {
            ApplicationFilterConfig[] newFilters = new ApplicationFilterConfig[n + 15];
            System.arraycopy(filters, 0, newFilters, 0, n);
            filters = newFilters;
        }
        filters[n++] = filterConfig;
    }
}