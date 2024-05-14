package com.yx.controller;

import com.yx.pojo.User;
import com.yx.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class UserController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserServiceImpl userService = new UserServiceImpl();

        List<User> user_list = userService.loginList(req.getParameter("user_account"), req.getParameter("user_password"));
        req.setAttribute("user_list",user_list);
        System.out.println(user_list);
        req.getRequestDispatcher("userList.jsp").include(req, resp);
    }

}
