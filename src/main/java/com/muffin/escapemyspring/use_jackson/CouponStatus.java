package com.muffin.escapemyspring.use_jackson;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  CouponStatus {

    USABLE("可用",1),
    USED("不可用",2);

    private String status;
    private int id;
}
