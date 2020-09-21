package com.muffin.escapemyspring.http_request_response;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/request")
public class UserController {

    @PostMapping("qinyi")
    public User getQinyi(@RequestBody(required = false) User user){

        if(null != user){
            return user;
        }
        return new User(-1L,"qinyi",20);
    }
}
