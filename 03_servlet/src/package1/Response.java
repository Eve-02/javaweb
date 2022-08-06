package package1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Response extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 常用于下载(传递二进制数据) */
        ServletOutputStream outputStream = resp.getOutputStream();
        /* 常用于回传字符串 */
        PrintWriter writer = resp.getWriter();

        // 两个流只能使用一个，否则就会报错
    }
}
