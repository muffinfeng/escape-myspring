package com.muffin.escapemyspring.filter_and_intercepter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LogIntercepter implements HandlerInterceptor {

    private long start = System.currentTimeMillis();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        start = System.currentTimeMillis();
        request.setAttribute("start",start);
        HandlerMethod method = (HandlerMethod)handler;
        log.info("LogIntercepter preHandle Class: {}",method.getBean().getClass().getName());
        log.info("LogIntercepter preHandle Method: {} ",method.getMethod().getName());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("LogIntercepter postHandle : {} -> {}",request.getRequestURI(),System.currentTimeMillis()-(long)request.getAttribute("start"));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
