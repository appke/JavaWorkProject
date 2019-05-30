package com.test;

public class Body {

    private String name;
    private int num=10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody() {
        System.out.println("外部类的方法---");
        Heart heart = new Heart();
        heart.beat();
    }

    public class Heart {

        private int num=20;

        public void beat() {
            System.out.println("心脏跳动---");
            System.out.println("我叫："+ name);

            int num=30;

            System.out.println("内部类局部变量："+num); // 就近原则
            System.out.println("内部类成员变量："+this.num);
            System.out.println("外部类成员变量："+Body.this.num);
        }
    }

}
