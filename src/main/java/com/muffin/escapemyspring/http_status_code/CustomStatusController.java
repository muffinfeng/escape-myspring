package com.muffin.escapemyspring.http_status_code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomStatusController {

    @GetMapping("/test")
    public GeneralResponse<String> test() throws CustomException {
        throw new CustomException("this is CustomException");
    }
}
