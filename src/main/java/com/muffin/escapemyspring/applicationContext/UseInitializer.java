package com.muffin.escapemyspring.applicationContext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
public class UseInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ApplicationContextStore.setApplicationContext(applicationContext);
        log.info("initializer Done.");
    }
}
