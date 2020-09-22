package com.muffin.escapemyspring.http_request_response;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class RequestParseUtil {

    public static boolean isJson(HttpServletRequest request){
        log.info("isJson: {}",request.getContentType());
        if(request.getContentType() != null){
            return request.getContentType().equals(MediaType.APPLICATION_JSON_VALUE)||request.getContentType().equals(MediaType.APPLICATION_JSON_UTF8_VALUE);
        }
        return false;
    }

    public static String getBodyString(ServletRequest servletRequest){
        try{
           return inputStream2String(servletRequest.getInputStream());
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

    public static String inputStream2String(InputStream stream){
        StringBuilder sb = new StringBuilder();
        BufferedReader br;
        try{
            br = new BufferedReader(new InputStreamReader(stream,"UTF-8"));
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
        return sb.toString();
    }
}
