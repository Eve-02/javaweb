<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        EL表达主要在jsp页面中输出域对象中的数据:
        当四个域都有相同的key的时候，EL表达式会按照从小到大的顺序进行输出，和代码的先后顺序没有关系
    --%>

    <%
        pageContext.setAttribute("key","value1");
        request.setAttribute("key","value2");
        session.setAttribute("key","value3");
        application.setAttribute("key","value4");
    %>

    ${key}

</body>
</html>
