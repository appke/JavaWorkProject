package com.test;

public class Demo09InnerClass {
    public static void main(String[] args) {

        // 类 模拟一类事物
        // 包含关系
        // 汽车 和 发动机

//        Body body = new Body();
//        body.methodBody();
//
//        System.out.println("============");
//
//        Body.Heart heart = new Body().new Heart();
//        heart.beat();

        methodOuter();
    }



    public static void methodOuter() {
        int num=10;
        // num=20
        class MyInner {
            public void methodInner() {
                System.out.println(num);
            }
        }

        new MyInner().methodInner();
    }
}
