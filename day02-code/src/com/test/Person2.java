package com.test;

import java.util.Objects;

public class Person2 implements Comparable<Person2> {

    private int age;
    private String name;

    public Person2() {
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person = (Person2) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Person2 o) {
        // return 0; //认为元素都是相同的
        // 按年龄升序
        return this.getAge() - o.getAge();
    }
}
