package com.yx.dao;

import com.yx.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface UserMessageDao {

    /**
     * 获取所有用户信息
     * @param
     * @return 返回所有用户数据
     * */
    public List<User> getAllUserData() throws ClassNotFoundException, SQLException;

    /**
     * @param name, password 用户登录账号和密码
     * @return 登录成功返回true，否则返回false
     * @throws ClassNotFoundException 数据库驱动加载失败
     * @throws SQLException 用户登录失败
     * */
    public boolean login(String name, String password) throws ClassNotFoundException, SQLException;
}
