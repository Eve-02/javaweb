<%@ page import="test.person" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="com.sun.org.apache.regexp.internal.REUtil" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%-- 关系运算、算法运算、逻辑运算 --%>
    ${ 12 == 12} 或 ${12 eq 12}
    <br/>
    ${12+12}

    ${ 12 == 12 && 12 > 11} <br/>

    <%--
        empty：空运算
        empty运算可以判断一个数据是否为空，如果为空，则输出true,不为空输出false
        以下几种情况为空：
            1、值为null值的时候，为空
            2、值为空串的时候，为空
            3、值是Object类型数组，长度为零的时候
            4、Iist集合，元素个数为零
            5、map集合，元素个数为零劑
            (null、长度为0、空串)
    --%>

    <%
//        request.setAttribute("key2",null);
        request.setAttribute("key2",123);
    %>
    ${ empty key2 } <br/>

    <%-- 三元运算 --%>
    ${ 10>4?"we":"wewe" } <br/>


    <%--
        点运算、[]中括号运算
        . 运算可以输出Bean对象中某个属性的值
        [] 可以输出有序集合中某个元素的值
    --%>
<%--    <%--%>
<%--        person p = new person("abc",new String[]{"123","234","345"},null,null);--%>
<%--        request.setAttribute("key",p);--%>
<%--    %>--%>
<%--    ${key.name} 和 ${key.phone[1]}--%>


    <%-- 并且[]中括号运算，还可以输出map集合中key里含有特殊字符的key的值。 --%>
    <%
        Map<String,Object> map = new HashMap<>();
        map.put("a.a.a","value1");
        map.put("b+b+b","value2");
        map.put("c-c-c","value3");
        request.setAttribute("key",map);
    %>
    ${key["a.a.a"]} 和 ${key["b+b+b"]}

</body>
</html>
