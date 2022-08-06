<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        response: 表示响应,经常用于设置返回客户端的内容
        out: 也是给用户作输出使用的

        【当jsp页面中所有代码执行完成后会执行以下两个操作：
         1.执行out.flush()操作，会把out缓冲区中的数据追加写入到response缓冲区
         2.执行response刷新操作，把所有数据写给客户端】

        【由于jsp翻译之后，底层代码都是用out输出，所以一般情况下，我们在jsp页面中
         统一使用out来输出数据，避免打乱页面输出内容的顺序】
    --%>

    <%
//        out.write("out输出1<br/>");
//
//        out.flush();
//
//        out.write("out输出2<br/>");
//
//        response.getWriter().write("response输出1<br/>");
//        response.getWriter().write("response输出2<br/>");

        out.write(12);
        out.print(12);

        /*
        * out.write()输出字符串没有问题，
        * out.print()输出任意数据都没有问题(都转化为字符串用write输出)
        * [write只适合输出字符串，在jsp页面中可以统一使用out.print()输出]
        */
    %>
</body>
</html>
