package com.test.reflect;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTets {
    public static void main(String[] args) throws Exception {
//        Person p = new Person();
//        p.sleep();


        Properties prop = new Properties();
        prop.load(ReflectTets.class.getClassLoader().getResourceAsStream("person.properties"));

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);


    }
}
