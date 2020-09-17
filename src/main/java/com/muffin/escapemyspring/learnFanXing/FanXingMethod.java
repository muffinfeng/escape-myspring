package com.muffin.escapemyspring.learnFanXing;

public class FanXingMethod {

    public <T> void show(T arg){
        System.out.println(arg.getClass());
    }

    public static void main(String[] args) {
        FanXingMethod fanXingMethod = new FanXingMethod();
        fanXingMethod.show(10L);
    }
}
