package com.zun1.filter;

import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by 王洋 on 2017/1/19.
 */
public class MyFilter implements javax.servlet.Filter {
    public void destroy() {
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain) throws javax.servlet.ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(javax.servlet.FilterConfig config) throws javax.servlet.ServletException {
        Enumeration<String> stringEnumeration = config.getInitParameterNames();
        while (stringEnumeration.hasMoreElements()) {
            System.out.println(config.getInitParameter(stringEnumeration.nextElement()));
        }
    }

}
