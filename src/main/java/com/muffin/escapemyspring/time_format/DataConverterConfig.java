package com.muffin.escapemyspring.time_format;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

@Configuration
public class DataConverterConfig {

    @Bean
    public DataJacksonConverter dataJacksonConverter(){
        return new DataJacksonConverter();
    }

    @Bean
    public Jackson2ObjectMapperFactoryBean jackson2ObjectMapperFactoryBean(
            @Autowired DataJacksonConverter dataJacksonConverter){
        Jackson2ObjectMapperFactoryBean bean = new Jackson2ObjectMapperFactoryBean();
        bean.setDeserializers(dataJacksonConverter);
        return bean;
    }
}
