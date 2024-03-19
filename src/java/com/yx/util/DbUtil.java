package com.yx.util;


import java.sql.*;

/**
 * 数据库工具类，封装
 * */
public class DbUtil {


    /**
     * @param
     * @return java.sql.COnnection   接口的类型实例
     * @throws ClassNotFoundException   驱动加载失败
     * @throws SQLException             数据库连接失败
     * */
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        //加载数据库驱动
        String userName = "root";
        String passWord = "123456";
        String url = "jdbc:mysql://localhost:3306/db_practice";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, userName, passWord);
        if(connection != null){
            System.out.println("连接成功");
        }else{
            System.out.println("连接失败");
        }
        return connection;
    }


    /**
     * 关闭数据库驱动
     * @author yang
     * */
    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException{

        if(resultSet != null) resultSet.close();
        if(statement != null) statement.close();
        if(connection != null) connection.close();
    }
}
