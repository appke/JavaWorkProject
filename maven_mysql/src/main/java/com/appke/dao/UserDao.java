package com.appke.dao;

import com.appke.domain.User;
import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
