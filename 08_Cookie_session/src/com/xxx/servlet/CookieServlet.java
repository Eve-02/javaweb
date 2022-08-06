package com.xxx.servlet;

import com.xxx.util.CookieUtils;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieServlet extends BaseServlet{

    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("key1","value1");
        Cookie cookie2 = new Cookie("key2","value2");

        resp.addCookie(cookie);
        resp.addCookie(cookie2);
    }

    protected void getCookie(HttpServletRequest req, HttpServletResponse resp){
        Cookie cookie = CookieUtils.findCookie("key1", req.getCookies());
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().write("找到Cookie: " + cookie.getName() + "=" + cookie.getValue());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp){
        // 方案一
        /* Cookie cookie = new Cookie("key1","newValue1");
        resp.setContentType("text/html;charset=utf-8");
        resp.addCookie(cookie);
        try {
            resp.getWriter().write("Cookie已经修改完成!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        // 方案二
        Cookie cookie = CookieUtils.findCookie("key2",req.getCookies());
        if(cookie != null){
            cookie.setValue("newValue2");
            resp.addCookie(cookie);
        }

    }

    protected void deleteCookieNow(HttpServletRequest req, HttpServletResponse resp){
        Cookie cookie = CookieUtils.findCookie("key1",req.getCookies());
        cookie.setMaxAge(0);
        if(cookie != null){
            resp.addCookie(cookie);
        }   
    }
}
