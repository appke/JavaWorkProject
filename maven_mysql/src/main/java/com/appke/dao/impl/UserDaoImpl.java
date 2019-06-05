package com.appke.dao.impl;

import com.appke.dao.UserDao;
import com.appke.domain.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public List<User> findAll() {

        List<User> list = new ArrayList<User>();
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://111.231.238.229:3306/mydb1", "root", "root123");

            pst = conn.prepareCall("select * from users;");
            rs = pst.executeQuery();

            while(rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));

                list.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {



            try {
                rs.close();
                pst.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }
}
