package com.xxx.servlet;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if("53007".equals(username) && "abc123".equals(password)){
            // 登陆成功
            System.out.println("登陆成功!");
            Cookie cookie1 = new Cookie("username",username);
            Cookie cookie2 = new Cookie("password",password);
            cookie1.setMaxAge(60 * 60 * 24 * 7);
            cookie2.setMaxAge(60 * 60 * 24 * 7);
            resp.addCookie(cookie1);
            resp.addCookie(cookie2);
        }else{
            // 登陆失败
            System.out.println("登陆失败!");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
