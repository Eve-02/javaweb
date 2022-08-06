<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        pageContext: 获取jsp九大内置对象

    --%>


    ${pageContext.request.contextPath}
    ${pageContext.request.serverName}
    ${pageContext.request.serverPort}
    ...

</body>
</html>
