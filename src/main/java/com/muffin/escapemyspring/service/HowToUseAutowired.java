package com.muffin.escapemyspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HowToUseAutowired {

    @Autowired
    private QYImooc qyImooc;

    public void print(){
        qyImooc.print();
    }
}
