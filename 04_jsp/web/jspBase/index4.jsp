<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        jsp常用标签:
          jsp静态包含
            <%@ include file="/public/footer.jsp"%>
          【静态包含 不会把包含的jsp页面翻译为java代码】

    --%>
    头部信息 <br/>
    主体内容 <br/>
    <%@ include file="/public/footer.jsp"%>


</body>
</html>
