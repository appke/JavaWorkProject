package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Demo10Sort {


    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        Person p1 = new Person("小石", 23);
        Person p2 = new Person("老李", 72);
        Person p3 = new Person("张三", 21);
        Person p4 = new Person("陈梁如", 21);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        Person person = new Person();


        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //return o1.getAge() - o2.getAge(); // 升序
                int result = o2.getAge() - o1.getAge();
                if (result == 0) {
                    result = o2.getName().charAt(0) - o1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);

    }
}
