package com.muffin.escapemyspring.time_format;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TimeFormatController {


    @GetMapping("/getTimeParam")
    public Map<String,Long> getRequest(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date){
        Map<String,Long> map = new HashMap<String,Long>();
        map.put("hikey",date.getTime());
        return map;
    }

    @PostMapping("/user")
    public Map<String, String> postData(@RequestBody User userInfo) {

        Map<String, String> result = new HashMap<>();

        result.put("name", userInfo.getName());
        result.put("birthday", String.valueOf(userInfo.getDate().getTime()));

        return result;
    }
 }
