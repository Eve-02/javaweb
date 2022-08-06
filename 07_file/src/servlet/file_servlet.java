package servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class file_servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 1.先判断上传的文件是否多段数据(只有是多段的数据，才是上传文件的)
        if(ServletFileUpload.isMultipartContent(req)){
            // 2.创建FileItemFactory工厂实现类
            FileItemFactory fileItemFactory = new DiskFileItemFactory();
            // 3.创建用于解析上传文件的工具类ServletFileUpload类
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            // 4.调用解析方法解析上传的数据，得到每一个表单项FileItem
            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);

                // 5.循环判断每一个表单项，是普通类型，还是上传的文件
                for (FileItem fileItem : list) {
                    if(fileItem.isFormField()){
                        // 普通表单项
                        System.out.println("表单项的name属性值" + fileItem.getFieldName());
                        System.out.println("表单项的value属性值" + fileItem.getString("UTF-8"));// 参数utf-8解决乱码问题
                    }else{
                        // 上传的文件
                        System.out.println("表单项的name属性值" + fileItem.getFieldName());
                        System.out.println("上传的文件名" + fileItem.getName());

                        fileItem.write(new File("/233.png"));
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


    }
}