package com.muffin.escapemyspring.learnFanXing;

import java.util.Arrays;
import java.util.List;

public class TongPeiFu {

    public static void test(List<? extends Number> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3,4,6));
        //test(Arrays.asList("ff"));
    }
}
