package com.test;

public class Demo08VarArgs {
    public static void main(String[] args) {

        int i = sum(1, 2, 4);
        System.out.println(i);
    }

    public static int sum(int...arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }
        return total;
    }

}
