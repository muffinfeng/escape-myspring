package com.muffin.escapemyspring.http_status_code;

import lombok.Data;

@Data
public class GeneralResponse<T> {
    private int code;
    private String message;
    private T data;

    public GeneralResponse(int code , String message){
        this.code = code;
        this.message = message;
    }

}
