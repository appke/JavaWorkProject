package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03CWE22 {

    public static void main(String[] args) {

        System.out.println(filter("/root/mgbook" + "../../aa.txt"));
        System.out.println(filter("/root/mgbook/..//aa.txt"));
        System.out.println(filter("/root/mgbook/..//aa//../..//b.txt"));
        System.out.println(filter("/root/mgbook/..//aa//../..//b.txt"));
        System.out.println(filter("../../../../../../../../../etc/passwd"));

        System.out.println(filter2("/users/cwe/profiles/../../../etc/important.doc"));

    }

    /* CWE-22 代码漏洞 路径穿越 */
    public static String filter(String data) {
//        Pattern pattern = Pattern.compile("[\\s\\\\/:\\*\\?\\\"<>\\|]");
//        Pattern pattern = Pattern.compile("[\\s\\.]");
        Pattern pattern = Pattern.compile("\\.\\.\\/");
        Matcher matcher = pattern.matcher(data);
        data = matcher.replaceAll("/");

//        data = Pattern.compile("\\/").matcher(data).replaceAll("/");
        data = data.replaceAll("\\/+", "/");


        return data;
    }



    public static String filter2(String data) {
//        Pattern pattern = Pattern.compile("[\\s\\\\/:\\*\\?\\\"<>\\|]");
//        Pattern pattern = Pattern.compile("[\\s\\.]");
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(data);
        data = matcher.replaceAll("");

//        data = Pattern.compile("\\/").matcher(data).replaceAll("/");
        data = data.replaceAll("\\/+", "/");


        return data;
    }
}
