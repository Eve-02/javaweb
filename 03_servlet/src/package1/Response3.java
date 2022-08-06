package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Response3 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("该地址已废弃~请前往新地址~");

//        // 设置响应码302，表示重定向(已搬迁)
//        resp.setStatus(302);
//        // 设置响应头
//        resp.setHeader("Location","http://localhost:8080/03_servlet/response4");

        // 第二种重定向方案
        resp.sendRedirect("http://localhost:8080/03_servlet/response4");
    }
}
