package package1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class ReguestAPI2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("userName");
        String password = req.getParameter("passWord");
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        String[] hobby = req.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getMethod());
        String username = req.getParameter("userName");
        String password = req.getParameter("passWord");
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        String[] hobby = req.getParameterValues("hobby");
        System.out.println(Arrays.asList(hobby));
    }
}
