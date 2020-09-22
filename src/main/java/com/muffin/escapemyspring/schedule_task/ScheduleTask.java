package com.muffin.escapemyspring.schedule_task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@SuppressWarnings("all")
public class ScheduleTask {

    @Scheduled(fixedRate = 1000)
    public void task1() throws Exception{
        log.info("task1 is running !!");
        while(true){
            Thread.sleep(2000);
            log.info("say something on task1 ...");
        }
    }

    @Scheduled(fixedRate = 1000)
    public void task2(){
        log.info("say something on task2 ...");
    }
}
