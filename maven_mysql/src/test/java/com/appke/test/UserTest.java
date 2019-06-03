package com.appke.test;

import com.appke.dao.UserDao;
import com.appke.dao.impl.UserDaoImpl;
import com.appke.domain.User;
import org.junit.Test;

import java.util.List;

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
