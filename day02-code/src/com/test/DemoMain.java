package com.test;

public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl obj = new MyInterfaceImpl();
//        obj.method();
        // 使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！");
            }
        };
        obj.method();
    }
}
