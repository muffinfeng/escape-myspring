package com.muffin.escapemyspring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMultiUsableBean {

    @Autowired
    @Qualifier("qinyiRedisTemplate")
//    @Resource
    private RedisTemplate imoocRedisTemplate;

    @Test
    public void testAutowire(){
        assert  imoocRedisTemplate != null;
        System.out.println(imoocRedisTemplate.getClass());
        imoocRedisTemplate.opsForValue().set("SpringBoot name","qinyi");
    }

}
