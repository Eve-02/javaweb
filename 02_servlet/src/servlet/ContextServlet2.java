package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ContextServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /* 1.获取ServletContext对象 */
        ServletContext context = getServletContext();

        /* 2. */
        context.setAttribute("hey1","value1");
        context.setAttribute("hey2","value1");
        context.setAttribute("hey3","value1");

        System.out.println("context2 中获取域数据key1的值是: " + context.getAttribute("key1"));
        System.out.println("context2 中获取域数据key1的值是: " + context.getAttribute("key2"));
        System.out.println("context2 中获取域数据key1的值是: " + context.getAttribute("key3"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
