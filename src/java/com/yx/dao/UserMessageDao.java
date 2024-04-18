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

}
