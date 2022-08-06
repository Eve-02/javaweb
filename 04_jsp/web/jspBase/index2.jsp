<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp内置域对象测试</title>
</head>
<body>
    <%--
        四个域对象:
        pageContext(PageContextImpl类) 当前jsp页面有效
        request(HttpservletRequst类) 一次请求内有效
        session(HttpSession类) 一次会话范围内有效(打开浏览器，直到关闭浏览器)
        application(ServletContext类) 整个web工程范围内都有效(只要web工程不停止，数据一直都在)

        【四个域对象可以像map一样存储数据的对象。不同的是它们对数据存储范围不同】

        【四个域对象的使用优先顺序是：从小到大(pageContext->request->session->application)
         因为存储范围大的域对象所占用的内存更大。存储范围更小的域对象的内存解放更快】
    --%>

    <%
        pageContext.setAttribute("key1","value1");
        request.setAttribute("key1","value2");
        session.setAttribute("key1","value3");
        application.setAttribute("key1","value4");
    %>
    pageContext中是否有值: <%=pageContext.getAttribute("key1")%> <br/>
    request: <%=request.getAttribute("key1")%> <br/>
    session: <%=session.getAttribute("key1")%> <br/>
    application: <%=application.getAttribute("key1")%> <br/>
</body>
</html>
