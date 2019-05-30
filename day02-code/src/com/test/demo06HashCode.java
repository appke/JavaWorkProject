package com.test;

public class demo06HashCode {
    public static void main(String[] args) {

        Student student = new Student();
        int h1 = student.hashCode();
//        student.toString();
        System.out.println(h1);
        System.out.println(student);

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("穆良".hashCode());


    }
}
