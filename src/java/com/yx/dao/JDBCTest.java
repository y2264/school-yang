package com.yx.dao;

import java.sql.*;

public class JDBCTest {

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public static void main(String[] args) {
        JDBCTest jdbcTest = new JDBCTest();
        jdbcTest.delete_Sql();
    }

    //加载驱动
    public JDBCTest(){
        System.out.println("JDBC starting...");
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/db_practice";
            String name = "root";
            String password = "123456";
            // 加载数据库
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 链接数据库
            connection = DriverManager.getConnection(url, name, password);
            if(connection != null){
                System.out.println("链接成功");
            }
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println("链接失败");
        }
    }

    /**
     * 输出指定数据
     * */
    public void print_Sql(){
        try {
            String se_sql = "select * from students;";
            resultSet = statement.executeQuery(se_sql);
            while(resultSet.next()){
                System.out.print(resultSet.getString(1) + "\t");
                System.out.print(resultSet.getString(2) + "\t");
                System.out.print(resultSet.getString(3) + "\t");
                System.out.print(resultSet.getString(4) + "\t");
                System.out.println(resultSet.getString(5) + "\t");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新数据库表
     * */
    public void update_Sql(){
        String update_sql = "update students set s_Name = ? where s_id = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(update_sql);
            ps.setString(1, "赵建华");
            ps.setInt(2, 1);
            if(ps.executeUpdate() > 0){
                System.out.println("修改成功");
                connection.commit();
            }else{
                System.out.println("修改失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 插入数据
    public void insert_Sql(){
        String in_sql = "insert into students values(default, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(in_sql);
            preparedStatement.setString(1, "令狐冲");
            preparedStatement.setString(2, "123456");
            preparedStatement.setString(3, "男");
            preparedStatement.setString(4, "2022-10-20");
            if(!preparedStatement.execute()){
                System.out.println("成功");
            }else{
                System.out.println("失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除数据
     * */
    public void delete_Sql(){
        String de_sql = "delete from students where s_id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(de_sql);
            preparedStatement.setInt(1, 1);
            if(preparedStatement.execute()){
                System.out.println("失败");
            }else{
                System.out.println("成功");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 关闭JDBC驱动
     * */
    public void JDBCClose(){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
