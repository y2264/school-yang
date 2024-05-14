package com.yx.dao;

import com.yx.pojo.User;
import com.yx.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserMessageDao {

    /**
     * 获取所有用户信息
     * @param
     * @return 返回所有用户数据
     * */
    public List<User> getAllUserData() throws ClassNotFoundException, SQLException{
        return null;
    };

    /**
     * @param account, password 用户登录账号和密码
     * @throws ClassNotFoundException 数据库驱动加载失败
     * @throws SQLException 用户登录失败
     * */
    public List<User> login(String account, String password) throws ClassNotFoundException, SQLException {
        Connection connection = DbUtil.getConnection();
        List<User> user_list = new ArrayList<>();
        String se_sql = "select * from user where user_account = ? and user_password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(se_sql);
        preparedStatement.setString(1, account);
        preparedStatement.setString(2, password);
        getResultUserList(user_list, preparedStatement);
        return user_list;
    }

    /**
     * 多样查询（当输入的数据元素个数未知时查询），无数据输入时为查询所有数据
     * @param user_id 用户编号
     * @param user_phone 用户手机号
     * @param user_sex 用户性别
     * @return List<User> 返回查询的用户数据
     * */
    public List<User> diverseSelect(String user_id, String user_phone, String user_sex) throws SQLException, ClassNotFoundException {
        Connection connection = DbUtil.getConnection();
        List<User> user_list = new ArrayList<>();
        String se_sql = "select * from user";
        int i = 0;
        //判断是否输入数据
        if(user_id != null || user_phone != null || user_sex != null) {
            se_sql += " where";
            if (user_id != null) {
                se_sql += " user_id = ?";
                i++;
            }
            if (user_phone != null) {
                se_sql += " user_phone = ?";
                i++;
            }
            if(user_sex != null){
                se_sql += " user_sex = ?";
                i++;
            }
        }
        PreparedStatement preparedStatement = connection.prepareStatement(se_sql);
        switch (i){
            case 3:
                preparedStatement.setString(i--, user_sex);
            case 2:
                preparedStatement.setString(i--, user_phone);
            case 1:
                preparedStatement.setString(i--, user_id);
        }
        return getResultUserList(user_list, preparedStatement);
    }

    private List<User> getResultUserList(List<User> user_list, PreparedStatement preparedStatement) throws SQLException {
        ResultSet result_set = preparedStatement.executeQuery();
        while (result_set.next()){
            User user = new User();
            user.setUser_id(result_set.getInt("user_id"));
            user.setUser_account(result_set.getString("user_account"));
            user.setUser_password(result_set.getString("user_password"));
            user.setUser_phone(result_set.getString("user_phone"));
            user.setUser_email(result_set.getString("user_email"));
            user.setUser_sex(result_set.getString("user_sex"));
            user_list.add(user);
        }
        return user_list;
    }
}
