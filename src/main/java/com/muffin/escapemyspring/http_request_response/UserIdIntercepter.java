package com.muffin.escapemyspring.http_request_response;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class UserIdIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(RequestParseUtil.isJson(request)){
            String json = RequestParseUtil.getBodyString(request);
            User user;
            log.info("UserIdIntercepter json : {}",json);
            try{
                user = new ObjectMapper().readValue(json,User.class);
                log.info("UserIdIntercepter logger user1 : {}",user);
            }catch (Exception e){
                user = null;
            }

            log.info("UserIdIntercepter logger user2 : {}",user);
        }
        log.info("UserIdIntercepter logger user nonono");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
