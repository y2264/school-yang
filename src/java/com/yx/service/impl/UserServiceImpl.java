package com.yx.service.impl;

import com.yx.dao.UserMessageDao;
import com.yx.pojo.User;
import com.yx.service.UserService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public List<User> loginList(String account, String password) {
        UserMessageDao userMessageDao = new UserMessageDao();

        try {
            return userMessageDao.login(account, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
