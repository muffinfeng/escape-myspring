package com.muffin.escapemyspring.use_jackson;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize(using = CouponSerialize.class)
//@JsonInclude(JsonInclude.Include.NON_NULL) //忽略为null的对象
//@JsonIgnoreProperties({"couponCode","status"})  //忽略这两个属性

public class Coupon {

//    @JsonIgnore  //序列化时忽略
    private Integer id;

//    @JsonProperty("user")  //序列化时命名为user
    private Integer userId;

    private String couponCode;

//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "hh:mm:ss")
    private Date assignTime;

    private CouponStatus status;

    private CouponTemplate couponTemplate;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CouponTemplate{
        private String name;
        private String logo;
    }

    public static Coupon fake(){
        return new Coupon(1,1,"01",new Date(),CouponStatus.USABLE,new CouponTemplate("生鲜","三只松鼠"));
    }
}
