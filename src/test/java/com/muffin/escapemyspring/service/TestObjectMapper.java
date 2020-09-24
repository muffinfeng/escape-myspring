package com.muffin.escapemyspring.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.muffin.escapemyspring.use_jackson.Coupon;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestObjectMapper {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void test1() throws IOException {
        Coupon coupon = Coupon.fake();
        //coupon.setCouponTemplate(null);
        log.info("Coupon se json : {}  ",objectMapper.writeValueAsString(coupon));
        //{"assignTime":"06:01:05","user":1}

        //{"id":"1","userId":"1","couponCode":"01","assignTime":"14:48:04","status":"可用","name":"生鲜","logo":"三只松鼠"}
        String s = "{\"id\":\"1\",\"userId\":\"1\",\"couponCode\":\"01\",\"assignTime\":\"14:48:04\",\"status\":\"USABLE\"}";
        objectMapper.setDateFormat(new SimpleDateFormat("hh:mm:ss"));
        log.info("this is dese dto : {}",objectMapper.readValue(s,Coupon.class));
    }
}
