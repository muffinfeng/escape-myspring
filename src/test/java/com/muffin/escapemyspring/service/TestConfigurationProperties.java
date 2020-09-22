package com.muffin.escapemyspring.service;

import com.muffin.escapemyspring.more_config.UserProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestConfigurationProperties {

    @Autowired
    private UserProperties userProperties;

    @Test
    public void testUserProperties(){
        System.out.println(userProperties.toString());
    }
}
