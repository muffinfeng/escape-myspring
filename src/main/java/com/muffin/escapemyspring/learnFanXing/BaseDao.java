package com.muffin.escapemyspring.learnFanXing;

import java.lang.reflect.ParameterizedType;

public abstract class BaseDao<T> {

    private Class clazz;

    public BaseDao(){
        Class clazz = this.getClass();
        ParameterizedType pt = (ParameterizedType)clazz.getGenericSuperclass();
        clazz = (Class)pt.getActualTypeArguments()[0];
        System.out.println(clazz);
    }

    public void add(T t){
        System.out.println("base add function");
    }




}
