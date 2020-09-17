package com.muffin.escapemyspring.applicationContext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

@Slf4j
public class ApplicationContextStore {

    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext applicationContext){
        log.info("Comming in applicationContext");
        ApplicationContextStore.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext(){
        log.info("Comming in applicationContext");
        return applicationContext;
    }
}
