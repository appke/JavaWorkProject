package com.test;

public class demo05Debug {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;
        int sum = a + b;

        System.out.println("求和-----"+ sum);

        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world----");
        }


        printHello();
    }


    private static void printHello() {
        System.out.println("Hello world----!");
        System.out.println("Hello world----!");
        System.out.println("Hello world----!");
    }
}
