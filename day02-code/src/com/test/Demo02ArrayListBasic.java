package com.test;

import java.util.ArrayList;

public class Demo02ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(22);
        list.add(107);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
