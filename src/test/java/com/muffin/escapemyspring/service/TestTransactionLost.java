package com.muffin.escapemyspring.service;

import com.muffin.escapemyspring.springTransaction.CustomException;
import com.muffin.escapemyspring.springTransaction.SpringTransaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestTransactionLost {

    @Autowired
    private SpringTransaction springTransaction;

    @Test
    public void testCatchExceptionCanNotRollback(){
        springTransaction.CatchExceptionCanNotRollback();
    }

    @Test
    public void testNotRuntimeExceptionCanNotRollback() throws CustomException {
        springTransaction.NotRuntimeExceptionCanNotRollback();
    }
}
