package com.muffin.escapemyspring.learnFanXing;

public class FanXingLei<T> {

    private T obj;

    private void setObj(T obj){
        this.obj = obj;
    }

    public static void main(String[] args) {
        FanXingLei<String> stringFanXingLei = new FanXingLei<String>();
        stringFanXingLei.setObj("ff");

        FanXingLei<Integer> integerFanXingLei = new FanXingLei<Integer>();
        integerFanXingLei.setObj(11);
    }
}
