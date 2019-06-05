package com.appke.test;

import com.appke.dao.UserDao;
import com.appke.dao.impl.UserDaoImpl;
import com.appke.domain.User;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class UserTest {

    @Test
    public void findAll() {
        UserDao dao = new UserDaoImpl();
        List<User> all = dao.findAll();

        for (User user : all) {
            System.out.println(user.getId()+" ----- "+ user.getName());
        }
    }


}
