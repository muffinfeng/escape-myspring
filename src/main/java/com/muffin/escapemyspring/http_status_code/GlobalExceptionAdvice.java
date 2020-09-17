package com.muffin.escapemyspring.http_status_code;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = CustomException.class)
    public ResponseEntity<GeneralResponse<String>> customException(CustomException e){
        GeneralResponse<String> response = new GeneralResponse<>(0,"hello msg");
        response.setData(e.getMessage());

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
