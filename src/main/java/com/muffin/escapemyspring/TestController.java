package com.muffin.escapemyspring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping(name = "/normal")
    public String normal(){
        return "hello";
    }
}
