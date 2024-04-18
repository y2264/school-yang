package com.yx.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet( "/session")
public class SessionServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Session常用的方法
        //获得Session,如果浏览器没有对应的Session对象，返回null
        HttpSession session = req.getSession();
        //获得Session,如果浏览器没有对应的Session对象，则浏览器创建新的Session对象，并返回
        HttpSession session1 = req.getSession(true);
        //获得Session的ID
        String id = session1.getId();
        System.out.println(id);
        //查看Session的创建时间,返回类型为long
        System.out.println(session1.getCreationTime());
        //查看Session最后一次被访问的时间，返回类型为long
        System.out.println(session1.getLastAccessedTime());
        //查看Session的有效时间,单位为秒
        System.out.println(session1.getMaxInactiveInterval());
        //设置Session的有效时间方法1：设置Web项目中“某个”Session的有效时间，单位为秒
        session1.setMaxInactiveInterval(60*60*24);
        //查看修改后的Session时间
        System.out.println(session1.getMaxInactiveInterval());
        //无条件的销毁Session
        session.invalidate();
    }

}