package com.muffin.escapemyspring.filter_and_intercepter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@WebFilter(urlPatterns = "/*",filterName = "logFilter")
public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Long start = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("expend time : {}",System.currentTimeMillis() - start);
    }

    @Override
    public void destroy() {

    }
}
