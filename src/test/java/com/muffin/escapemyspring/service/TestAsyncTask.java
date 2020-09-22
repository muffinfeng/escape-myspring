package com.muffin.escapemyspring.service;

import com.muffin.escapemyspring.ansyc_task.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAsyncTask {

    @Autowired
    private AsyncService asyncService;

    @Test
    public void test1() throws Exception {
        asyncService.asyncTask1();
        Future<String> future = asyncService.asyncTask2();
        log.info("asyncTask2 result : {}",future.get(1, TimeUnit.SECONDS));
    }

    @Test
    public void test2() throws Exception{
        asyncService.asyncTask3();
        Thread.sleep(3000);
    }
}
