package com.test.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Demo02Template {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());


    @Test
    public void test1() {
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql = "update users set balance=2300 where id=101";
        int count = template.update(sql);
        System.out.println(count);
    }


    @Test
    public void testInsert() {
        String sql = "insert into users(id, name, balance) values(?, ?, ?)";
        int count = template.update(sql, 103, "老马", 7500);
        System.out.println(count);
    }

    @Test
    public void test3() {
        String sql = "delete from users where id=?";
        template.update(sql, 104);
    }


    @Test
    public void test4() {
        String sql = "select * from users where id=?";
        Map<String, Object> map = template.queryForMap(sql, 101);
        System.out.println(map);
    }


    @Test
    public void test5() {
        String sql = "select * from users";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    @Test
    public void test6() {
        String sql = "select * from users";
        List<Person> list = template.query(sql, new RowMapper<Person>() {
            @Override
            public Person mapRow(ResultSet rs, int i) throws SQLException {
                // 每调用1次封装一个对象
                Person ps = new Person();
                ps.setId(rs.getInt("id"));
                ps.setName(rs.getString("name"));
                ps.setBalance(rs.getInt("balance"));

                return ps;
            }
        });

        for (Person person : list) {
            System.out.println(person);
        }
    }

    @Test
    public void test6_2() {
        String sql = "select * from users";
        List<Person> list = template.query(sql, new BeanPropertyRowMapper<>(Person.class));

        for (Person person : list) {
            System.out.println(person);
        }
    }

    @Test
    public void test7() {
        String sql = "select count(*) from users";
//        Long total = template.queryForObject(sql, Long.class);

        Integer total = template.queryForObject(sql, Integer.class);
        System.out.println(total);
    }



    public void jdbcBasic() {

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {

            conn = JDBCUtils.getConnection();

            String sql = "select * from users";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt("id")+"---"+rs.getString("name")+"---"+ rs.getInt("balance"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(rs, pst, conn);
        }
    }

}
