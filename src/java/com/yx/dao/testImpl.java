package com.yx.dao;

import com.yx.pojo.Students;
import com.yx.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class testImpl{

    /**
     * @return 返回students的列表
     * */
    public List<Students> selectSql() throws SQLException, ClassNotFoundException {
        List<Students> studentsList = new ArrayList<>();
        Connection connection = DbUtil.getConnection();
        String se_sql = "select * from students";
        PreparedStatement preparedStatement = connection.prepareStatement(se_sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            Students students = new Students();
            students.setS_id(resultSet.getInt(1));
            students.setS_name(resultSet.getString(2));
            students.setS_pwd(resultSet.getString(3));
            students.setS_sex(resultSet.getString(4));
            students.setS_birthday(resultSet.getString(5));
            studentsList.add(students);
        }
        return studentsList;
    }

}