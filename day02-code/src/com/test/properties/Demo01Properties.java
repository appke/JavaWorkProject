package com.test.properties;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Demo01Properties.class.getClassLoader();
        URL resource = classLoader.getResource("mysql.properties");
        String path = resource.getPath();

        Properties prop = new Properties();
        prop.load(new FileReader(path));
        Set<String> names = prop.stringPropertyNames();//得到配置文件的名字
        for (String key : names) {
            String value = prop.getProperty(key);
            System.out.println(key + "----" + value);
        }

    }
}
