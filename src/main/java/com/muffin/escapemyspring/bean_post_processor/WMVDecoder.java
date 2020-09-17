package com.muffin.escapemyspring.bean_post_processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WMVDecoder implements IDecoder {
    @Override
    public VideoType type() {
        return VideoType.WMV;
    }

    @Override
    public String decode(String data) {
        return this.type().getDesc() + data;
    }
}
