package com.xxx.Servlet;

import com.google.gson.Gson;
import com.xxx.pojo.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AjaxServlet extends BaseServlet{

    protected void javaScriptAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ajax请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }

    protected void jQueryAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQuery请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }

    protected void jQueryGetAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGet请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }

    protected void jQueryPostAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryPost请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }

    protected void jQueryGetJSONAjax(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQueryGetJSONAjax请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }

    protected void jQuerySerialize(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("jQuerySerialize请求过来了");
        Person person = new Person(1,"abc");
        String JsonString = new Gson().toJson(person);
        resp.getWriter().write(JsonString);
    }
}
