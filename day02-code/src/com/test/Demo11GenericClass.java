package com.test;

import sun.net.www.content.text.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo11GenericClass {
    public static void main(String[] args) {
//        GenericClass<String> gc1 = new GenericClass();
//        gc1.setName("这是字符串");
//
//        GenericClass<Integer> gc2 = new GenericClass();
//        gc2.setName(120);

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(21);
        list01.add(35);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("xiaoyan");
        list02.add("xiaohua");

        printArrayList(list01);
        printArrayList(list02);
    }

    public static void printArrayList(ArrayList<?> list) {

        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
