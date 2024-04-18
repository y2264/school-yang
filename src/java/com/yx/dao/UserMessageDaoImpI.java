package com.yx.dao;

import com.yx.pojo.User;
import com.yx.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserMessageDaoImpI implements UserMessageDao{

    @Override
    public List<User> getAllUserData() throws ClassNotFoundException, SQLException {
        return null;
    }

    @Override
    public boolean login(String name, String password) throws ClassNotFoundException, SQLException {
        Connection connection = DbUtil.getConnection();
        String se_sql = "select * from user where user_id = ? and user_password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(se_sql);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) return true;
        return false;
    }
}
