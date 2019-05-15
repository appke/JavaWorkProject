package com.test;

public class Demo2Student {
    public static void main(String[] args) {
        Student stu1 = new Student();

        stu1.setName("xiaohong");
        stu1.setAge(23);
        stu1.setMale(true);
        stu1.printInfo();


        Student stu2 = new Student("xiaoming", 12, false);
        stu2.printInfo();
    }
}
