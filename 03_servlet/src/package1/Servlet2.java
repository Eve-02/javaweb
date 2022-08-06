package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求的参数(资料)查看
        String userName = request.getParameter("userName");
        System.out.println("在servlet2()柜台2中查看该资料: " + userName);

        // 查看柜台1是否有印章
        Object key1 = request.getAttribute("key");
        System.out.println("柜台1是否有印章: " + key1);

        // 处理自己的业务
        System.out.println("柜台2处理自己的业务");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
