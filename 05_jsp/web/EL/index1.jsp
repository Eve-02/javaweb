<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%--
        EL表达式的输出格式是: ${表达式},
        EL表达式在输出null值的时候，EL表达式输出空字符串，而jsp表达式脚本输出null字符串

    --%>

    <%
        request.setAttribute("key1","value1");
    %>

    <%= request.getAttribute("key1")%> <br/>
    ${key1}
</body>
</html>
