package servlet;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

public class Download extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.获取要下载的文件名
        String downloadFileName = "图片.png";

        // 2.读取要下载的文件内容(通过ServletContext对象可以读取)
        ServletContext servletContext = getServletContext();
        // "/" 被服务器解析表示为地址 http://ip:port/工程名/ 映射到代码的web目录
        InputStream resourceAsStream = servletContext.getResourceAsStream("/img/" + downloadFileName);

        // 4.在回传之前通过响应头告诉客户端返回的数据类型
        // 获取要下载的文件类型
        String mimeType = servletContext.getMimeType("/img/" + downloadFileName);
        System.out.println("下载的文件类型: " + mimeType);
        resp.setContentType(mimeType);

        // 5.告诉客户端收到的数据是用于下载使用(还是使用响应头)
        // Content-Disposition表示：收到的内容浏览器作出什么处理
        // attachment表示附件，表示下载使用
        // filename表示指定下载的文件名(下载的文件名可以任意)
        // resp.setHeader("Content-Disposition","attachment;filename=" + downloadFileName);
        // url编码是把内容(汉字转化为16进制的格式)
        resp.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode("中.png","UTF-8"));

        // 3.把下载的内容回传给客户端
        // 获取响应流的输出流
        ServletOutputStream outputStream = resp.getOutputStream();
        // 读取输入流中的数据，复制给输出流，输出给客户端
        IOUtils.copy(resourceAsStream,outputStream);

    }
}
