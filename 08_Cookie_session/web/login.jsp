<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="script/jquery-1.7.2.js"></script>
</head>
<body>
    <form action="http://localhost:8080/08_Cookie_session/loginServlet" method="get">
        用户名: <input type="text" name="username" value="${cookie.username.value}"> <br/>
        密码: <input type="password" name="password" value="${cookie.password.value}"> <br/>
        <input type="submit" value="登陆">
    </form>
</body>
</html>
