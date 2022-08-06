package servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class helloServlet extends HttpServlet {

    public helloServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用了doGet方法");
        show();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("调用了doPost方法");
    }

    public void show(){
        ServletConfig config = getServletConfig();
        /* 1. */
        System.out.println(config.getServletName());
        /* 2. */
        System.out.println(config.getInitParameter("url"));
        System.out.println(config.getInitParameter("username"));
        /* 3. */
        System.out.println(config.getServletContext());
    }

}
