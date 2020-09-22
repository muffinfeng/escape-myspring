package com.muffin.escapemyspring.ansyc_task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Slf4j
@Service
public class AsyncService {

    @Async
    public void asyncTask1() throws Exception{
        log.info("asyncTask1 is start ");
        Thread.sleep(2000);
        log.info("asyncTask1 is done");
    }

    @Async
    public Future<String> asyncTask2() throws Exception{
        log.info("asyncTask2 is start ");
        Thread.sleep(2000);
        log.info("asyncTask2 is done");
        return new AsyncResult<>("i am a result");
    }

    @Async
    public void asyncTask3() throws Exception{
        log.info("asyncTask3 is start {}" ,Thread.currentThread().getName());
        Thread.sleep(2000);
        throw new RuntimeException("this is an Exception on asyncTask3");
    }
}
