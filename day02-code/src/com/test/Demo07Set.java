package com.test;

import java.util.HashSet;
import java.util.Set;

public class Demo07Set {
    public static void main(String[] args) {

        Person p1 = new Person("小石", 28);
        Person p2 = new Person("小石", 28);
        Person p3 = new Person("老王", 32);

        // 同名同年龄的人只存储1次
        Set<Person> set = new HashSet<>();

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(set);

    }
}


