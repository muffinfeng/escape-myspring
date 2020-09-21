package com.muffin.escapemyspring.filter_and_intercepter;

import com.muffin.escapemyspring.http_request_response.UserIdIntercepter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
@Configuration
public class WebIntercepterAdapter implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogIntercepter()).addPathPatterns("/**").order(0);
        registry.addInterceptor(new UserIdIntercepter()).addPathPatterns("/**").order(1);
    }
}
