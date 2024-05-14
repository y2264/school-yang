package com.yx.service;


import com.yx.pojo.User;

import java.util.List;

/**
 * 用户功能类
 * */
public interface UserService {

    /**
     * @param account 账号
     * @param password 密码
     * @return 返回登录的用户数据
     * */
    List<User> loginList(String account, String password);

}
