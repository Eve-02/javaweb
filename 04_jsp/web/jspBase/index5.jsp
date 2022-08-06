<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
         动态包含
            <jsp:include page="/public/footer.jsp" ></jsp:include>
         【1.动态包含会把包含的jsp页面也翻译为java代码】
         【2.(index5.jsp把当前的内置对象 request、response、out传给了footer.jsp)】
         【3.动态包含可以传递参数】

    --%>

    头部信息 <br/>
    主体内容 <br/>
    <jsp:include page="/public/footer.jsp" >
        <jsp:param name="username" value="root"/>
        <jsp:param name="password" value="abc123"/>
    </jsp:include>

    <%-- 请求转换 --%>
    <jsp:forward page="/jspBase/error500.jsp"></jsp:forward>
</body>
</html>
