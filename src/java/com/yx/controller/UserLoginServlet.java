package com.yx.controller;

import com.yx.dao.UserMessageDaoImpI;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "login")
public class UserLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String id = req.getParameter("userId");
        String password = req.getParameter("userPassWord");

        if(id != null && id.matches("^[0~9]{1,6}$")){
            req.setAttribute("error", "用户编号只能为1-6的整数");
            return;
        }
        UserMessageDaoImpI userMessageDaoImpI = new UserMessageDaoImpI();
        try {
            userMessageDaoImpI.login(req.getParameter("name"), req.getParameter("password"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
