package com.muffin.escapemyspring.service;

import com.muffin.escapemyspring.bean_post_processor.*;
import com.muffin.escapemyspring.util.ApplicationUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class TestBeanPostProcessor {

    @Autowired
    public WMVDecoder wmvDecoder;

    @Autowired
    public AVIDecoder aviDecoder;

    @Test
    public void testEasyUseProcessor(){
        VideoType type = getRandomVideoType();

        switch (type){
            case WMV:
                log.info(aviDecoder.decode("data"));
                break;
            case AVI:
                log.info(wmvDecoder.decode("data"));
                break;
             default:
                 log.info("error");

        }

    }

    @Autowired
    private DecoderManager decoderManager;

    @Test
    public void testDecodeManager(){
        log.info(decoderManager.decode(getRandomVideoType(),"data"));
    }


    private VideoType getRandomVideoType(){
        return  VideoType.values()[new Random().nextInt(VideoType.values().length)];
    }

    @Test
    public void testThirdPartyToProtoType(){
        ThirdParty t1 = ApplicationUtil.getBean(ThirdParty.class);
        ThirdParty t2 = ApplicationUtil.getBean(ThirdParty.class);

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
