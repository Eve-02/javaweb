<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        获取请求参数的EL内置对象:
    --%>

    <%-- 例：参数只有一个值时(username[username=root]) --%>
    <%-- 输出请求参数的值 --%>
    ${ param }
    <%-- 输出请求参数为username的值 --%>
    ${ param.username } <br/>

    <%-- 例：参数有多个值时(hobby[hobby=java$hobby=cpp$hobby=javascript]) --%>
    <%-- 并用对应下标取出相应的值 --%>
    ${ paramValues.username[0] }


    <%--
        获取请求头的的值
    --%>
    <%-- 例：获取请求头User-Agent的值 --%>
    ${header["User-Agent"]}


</body>
</html>
