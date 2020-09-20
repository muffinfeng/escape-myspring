package com.muffin.escapemyspring.time_format;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

@Slf4j
public class DataJacksonConverter extends JsonDeserializer<Date> {

    private static final String[] pattern = new String[]{
            "yyyy-MM-dd HH:mm:ss","yyyy/MM/dd HH:mm:ss"
    };

    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        Date targetDate = null;
        String originDate = jsonParser.getText();

        if(StringUtils.isNotEmpty(originDate)){
            try{
                long l = Long.parseLong(originDate.trim());
                targetDate = new Date(l);
            }catch (NumberFormatException e){
                try{
                    targetDate = DateUtils.parseDate(originDate,pattern);
                }catch (ParseException ex){
                    log.error("parse error: {} ",ex.getMessage());
                    throw new IOException("IOException");
                }

            }

        }


        return targetDate;
    }

    @Override
    public Class<?> handledType(){
        return Date.class;
    }
}
