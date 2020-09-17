package com.muffin.escapemyspring.springTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpringTransaction implements ISpringTransaction {

    @Autowired
    private IdAndNameDao idAndNameDao;

    /**
     *  捕获异常肯定不回滚
     * */
    @Override
    @Transactional
    public void CatchExceptionCanNotRollback() {
        try{
            idAndNameDao.save(new IdAndName("qiner"));
            throw new RuntimeException("hello");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *  受查时（非运行）异常不回滚
     * */
    @Override
    @Transactional
    public void NotRuntimeExceptionCanNotRollback() throws CustomException {
        try{
            idAndNameDao.save(new IdAndName("qiner"));
            throw new RuntimeException();
        }catch (Exception e){
            throw new CustomException("Cucucucustom Exception ~");
        }
    }

    @Override
    @Transactional
    public void RuntimeExceptionCanRollback() {
        idAndNameDao.save(new IdAndName("qiner"));
        throw new RuntimeException();
    }

    /**
     *  主动注明能回滚的Exception
     * */
    @Override
    @Transactional(rollbackFor = CustomException.class)
    public void AssignExceptionCanRollback() throws CustomException {
        try{
            idAndNameDao.save(new IdAndName("qinsan"));
            throw new RuntimeException();
        }catch (Exception e){
            throw new CustomException("Cucucucustom Exception ~");
        }
    }

    @Transactional
    public void anotherOneSaveMethod(){
        idAndNameDao.save(new IdAndName("qiner"));
        throw new RuntimeException();
    }

    /** 同一个类中, 一个不标注事务的方法去调用标注了事务的方法, 事务会失效 */
    @Override
    public void NonTransactionalCanNotRollback() {
        anotherOneSaveMethod();
    }
}
