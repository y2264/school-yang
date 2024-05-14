package com.yx.pojo;


import java.io.Serializable;

/**
 * 用于jsp的测试实体类，JavaBean
 * */
public class Students implements Serializable {

    private int s_id;
    private String s_name;
    private String s_pwd;
    private String s_sex;
    private String s_birthday;

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_pwd() {
        return s_pwd;
    }

    public void setS_pwd(String s_pwd) {
        this.s_pwd = s_pwd;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_birthday() {
        return s_birthday;
    }

    public void setS_birthday(String s_birthday) {
        this.s_birthday = s_birthday;
    }

    @Override
    public String toString() {
        return "Students{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_pwd='" + s_pwd + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_birthday='" + s_birthday + '\'' +
                '}';
    }
}
