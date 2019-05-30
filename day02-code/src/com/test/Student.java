package com.test;


/*
* 一个完整的类
* */
public class Student {

    private String name;
    private int age;
    private boolean male;

    public Student() {
    }

    public Student(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void printInfo() {
        System.out.println("名称："+ this.name +'\t'+ "年龄：" + this.age +'\t'+"是否是男："+ this.male);
    }

}
