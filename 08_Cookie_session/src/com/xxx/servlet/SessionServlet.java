package com.xxx.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends BaseServlet {

    protected void createSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String id = session.getId();
        boolean isNew = session.isNew();
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("session的id为: " + id + "<br/>");
        resp.getWriter().write("session是否为第一次创建: " + isNew + "<br/>");

    }

    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp){

        Object key1 = req.getSession().getAttribute("key1");
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().write("获取session域中的的数据：" + key1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp){

        req.getSession().setAttribute("key1","value1");

    }


    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp){

        HttpSession session = req.getSession();
        int maxInactiveInterval = session.getMaxInactiveInterval();
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().write("session默认的超时时长为：" + maxInactiveInterval + "s");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    protected void Life3(HttpServletRequest req, HttpServletResponse resp){
        req.getSession().setMaxInactiveInterval(3);
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().write("当前Session超时时长已经被设置3秒");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    protected void delete(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        session.invalidate();
        try {
            resp.getWriter().write("00");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
