package com.yx;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    JButton btn1;
    JButton btn2;
    JButton btn3;

    public MyFrame(){
        //设置当前窗体的布局管理器为null
        this.setLayout(null);
        //设置当前窗体的标题
        this.setTitle("我的第一个Java窗体");
        //设置当前窗体在显示器中的位置与大小
        this.setBounds(200,200,400,300);
        //设置当前窗口不能改变大小
        this.setResizable(false);
        //设置窗体默认的关闭事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //创建按钮
        btn1 = new JButton("红色");
        //设置按钮在窗体中的位置与大小
        btn1.setBounds(50,200,75,25);
        //将按钮添加到窗体的内容面板中
        this.getContentPane().add(btn1);
        //创建监听器，监听按钮的单击事件
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.this.getContentPane().setBackground(Color.RED);
            }
        });

        btn2 = new JButton("绿色");
        btn2.setBounds(155,200,75,25);
        this.getContentPane().add(btn2);
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.this.getContentPane().setBackground(Color.GREEN);
            }
        });

        btn3 = new JButton("蓝色");
        btn3.setBounds(260, 200, 75, 25);
        this.getContentPane().add(btn3);
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyFrame.this.getContentPane().setBackground(Color.BLUE);
            }
        });

        //显示窗体
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
