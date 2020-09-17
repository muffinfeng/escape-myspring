package com.muffin.escapemyspring.bean_post_processor;

public interface IDecoder {

    VideoType type();

    String decode(String data);
}
