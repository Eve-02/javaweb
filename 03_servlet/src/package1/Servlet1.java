package package1;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Servlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数(资料)查看
        String userName = request.getParameter("userName");
        System.out.println("在servlet1()柜台1中查看该资料: " + userName);

        // 给资料印章
        request.setAttribute("key","柜台1的章");

        // 问路: servlet2怎么走(路径)
        // path: 要以 / 开关。/ 为到 http://ip:port/工程名，映射到IDEA的web目录
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet2");

        // 走向servlet2(转到servlet2)
        requestDispatcher.forward(request,response);
    }
}
