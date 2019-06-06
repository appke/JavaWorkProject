package com.test.jdbc;

import java.sql.*;

public class Demo01JDBC {
    public static void main(String[] args) {


        Connection conn = null;
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        try {
            conn = JDBCUtils.getConnection();
            conn.setAutoCommit(false);
            String sql1 = "update users set balance=balance-? where id=?";
            String sql2 = "update users set balance=balance+? where id=?";
            pst1 = conn.prepareStatement(sql1);
            pst2 = conn.prepareStatement(sql2);

            pst1.setDouble(1, 500);
            pst1.setDouble(2, 101);
            pst2.setDouble(1, 500);
            pst2.setDouble(2, 102);

            pst1.executeUpdate();
            int num = 31/0; // 人为制造异常
            pst2.executeUpdate();
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            e.printStackTrace();
        } finally {
            JDBCUtils.close(pst1, conn);
            JDBCUtils.close(pst2, conn);
        }


        try {
            test01();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void test02() {

//        PreparedStatement pst = conn.prepareStatement("alter table users add balance int;");
//        pst.execute();
//        JDBCUtils.close(conn, pst, null);
    }


    public static void test01() throws SQLException {
        Connection conn = JDBCUtils.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id, name, balance from users;");

        while(rs.next()) {
            System.out.println(rs.getInt("id") + "----" + rs.getString("name") +"----"+rs.getInt("balance"));
        }
        JDBCUtils.close(rs, st, conn);
    }

}
