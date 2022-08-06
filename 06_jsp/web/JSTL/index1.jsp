<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        1.<c:set />: 可以往域中保存数据
            scope设置保存到哪个域：page表示 PageContext域，默认值是page
            var: 设置key
            value: 设置值
    --%>
    ${pageScope.key1} <br/>

    <c:set scope="page" var="key1" value="value1" />

    ${pageScope.key1} <br/>


    <%--
        2.<c:if />: 用来做if判断
            test属性表示判断的条件(使用EL表达式输出)
            为true时，将中间的内容执行,为false时不执行
            [注意无法写else，只能使用多个if标签代表]
    --%>
    <c:if test="${12 == 12}" >
        <h1>12等于12</h1>
    </c:if> <br/> <br/>


    <%--
        3.choose、when、otherwise标签
            多路判断，和switch...case...default非常接近
            choose标签：开始选择判断,
            when标签：表示每一种判断情况，test表示该种情况的值
            otherwise标签：表示其它情况
        [与switch...case不同的是，choose执行完符合的情况之后就不会再执行，而wsitch需要添加breadk]
        [标签能不能使用html注释，使用jsp注释]
    --%>
    <%
        request.setAttribute("height",100);
    %>

    <c:choose>
        <c:when test="${ requestScope.height > 190 }">
            <h2>小巨人</h2>
        </c:when>
        <c:when test="${ requestScope.height > 180 }">
            <h2>很高</h2>
        </c:when>
        <c:when test="${ requestScope.height > 170 }">
            <h2>不错</h2>
        </c:when>
        <c:otherwise>
            <c:choose>
                <c:when test="${requestScope.height > 160}">
                    <h2>大于160</h2>
                </c:when>
                <c:otherwise>
                    其它情况
                </c:otherwise>
            </c:choose>
        </c:otherwise>
    </c:choose>

</body>
</html>
