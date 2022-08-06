package servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {

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
        ServletContext context = getServletConfig().getServletContext();

        /* 1.获取上下文参数 */
        System.out.println(context.getInitParameter("username"));
        System.out.println(context.getInitParameter("password"));

        /* 2.获取当前的工程路径：/工程路径 */
        System.out.println("当前工程路径" + context.getContextPath());

        /* 3.获取工程部署后在服务器硬盘上的绝对路径 */
        /*
        *   / 被服务器解析为: http://ip:port/工程名/ (对应配置文件(path="02_servlet")中的真实地址(docBase)中的文件) 映射到IDEA代码的web目录
        *
        *   Using CATALINA_BASE:
        *   "C:\Users\Eve-02\AppData\Local\JetBrains\IntelliJIdea2022.1
        *   \tomcat\98366956-8963-4ae9-a2b4-f578188d7f91"
        *   该路径是IDEA整合Tomcat之后，Tomcat被拷贝的一些内容
        *
        *   Using CATALINA_HOME:
        *   "D:\serverEnvirenment\Tomcat\apache-tomcat-8.0.50"
        *
         */
        System.out.println("工程部署的真实路径是 " + context.getRealPath("/"));
        System.out.println("工程下css目录的绝对路径是: " + context.getRealPath("/css"));
    }

}
