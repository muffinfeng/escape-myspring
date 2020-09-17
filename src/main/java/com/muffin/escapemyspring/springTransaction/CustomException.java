package com.muffin.escapemyspring.springTransaction;

//受查时异常
public class CustomException extends Exception {

    public CustomException(String name){
        super(name);
    }
}
