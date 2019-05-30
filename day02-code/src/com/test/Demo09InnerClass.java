package com.test;

public class Demo09InnerClass {
    public static void main(String[] args) {

        // 类 模拟一类事物
        // 包含关系
        // 汽车 和 发动机

        Body body = new Body();
        body.methodBody();

        System.out.println("============");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
