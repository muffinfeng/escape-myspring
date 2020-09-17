package com.muffin.escapemyspring.bean_post_processor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VideoType {

    AVI("AVI"),
    WMV("WMV");

    private String desc;
}
