package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ReguestAPI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 1.获取请求的资源路径 */
        System.out.println(req.getRequestURI());
        /* 2.获取请求的资源统一定位符(绝对路径) */
        System.out.println(req.getRequestURL());
        /* 3.获取客户的ip地址 */
        System.out.println(req.getRemoteHost());
        /* 4.获取请求头 */
        System.out.println(req.getHeader("User-Agent"));
        /* 5.获取请求的方法 */
        System.out.println(req.getMethod());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
