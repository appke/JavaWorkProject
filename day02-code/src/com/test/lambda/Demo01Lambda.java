package com.test.lambda;

public class Demo01Lambda {
    public static void main(String[] args) {

        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了1---");

            }
        });

        invokeCook(()->{
            System.out.println("吃饭了2---");
        });
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
