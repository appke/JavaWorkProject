package com.test.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo02Lambda {

    public static void main(String[] args) {

        // 根据年龄升序
        Person[] arr = {
                new Person("小王", 32),
                new Person("小郭", 24),
                new Person("老陈", 41),
                new Person("小吴", 27)
        };


        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Arrays.sort(arr, (Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        // 遍历
        for (Person p : arr) {
            System.out.println(p);
        }
    }



}
