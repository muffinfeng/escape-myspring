package com.muffin.escapemyspring.bean_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AVIDecoder implements IDecoder,InitializingBean {
    @Override
    public VideoType type() {
        return VideoType.AVI;
    }

    @Override
    public String decode(String data) {
        return this.type().getDesc() + " : " + data;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("afterPropertiesSet :  {}" ,this.type().getDesc());
    }
}
