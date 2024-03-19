package com.yx.pojo;

public class Student extends Person{

    private String shenfen;
    public Student(){
        System.out.println("Student无参");
    }

    public Student(String shenfen){
        System.out.println("Student有参");
        this.shenfen = shenfen;
    }
}
