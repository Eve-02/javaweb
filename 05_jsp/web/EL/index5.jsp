<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--
        EL表达式内置四个域对象，与jsp内置四个域对象一一对应
     --%>

    <%
        pageContext.setAttribute("key1","pageContext1");
        pageContext.setAttribute("key2","pageContext2");

        request.setAttribute("key1","request1");
        session.setAttribute("key1","session");
        application.setAttribute("key1","application");
    %>
    <%-- 选择性获取指定域的数据，不会与其它域冲突 --%>
    ${pageScope.key1}
    ${applicationScope}


</body>
</html>
