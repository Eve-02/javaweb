package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Response2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 要求：给客户端回传 字符串 数据

//        /* 设置服务器的字符集为UTF-8 */
//        resp.setCharacterEncoding("UTF-8");
//        /* 同时通过响应头也设置浏览器的字符集为UTF-8 */
//        resp.setHeader("Content-type","text/html;charset=UTF-8");

        /* 同时设置服务器和浏览器的字符集为UTF-8 */
        // 该方法要在获取流对象之前调用才有效
        resp.setContentType("text/html;charset=UTF-8");

        System.out.println(resp.getCharacterEncoding());

        PrintWriter writer = resp.getWriter();
        writer.println("response回传(响应)的数据");
    }
}
