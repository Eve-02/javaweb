<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="test.student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table {
            width: 500px;
            border: 1px solid red;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid red;
        }
    </style>
</head>
<body>
    <%--
        <c:forEach />标签：遍历
            begin属性：设置开始的索引
            end属性：设置结束的索引
            var属性：表示循环的变量(也是当前正在遍历到的数据)

            items属性：表示数组的数据源(遍历的集合)
    --%>

    <%-- 1.遍历1到10 --%>
    <table>
    <c:forEach begin="1"  end="10" var="i">
        <%--<h2> ${i} </h2>--%>
        <tr>
            <td>第${i}行</td>
        </tr>
    </c:forEach>
    </table>

    <%-- 2.遍历对象数组 --%>
    <%
        request.setAttribute("array",new String[]{"a","b","c","d"});
    %>
    <c:forEach items="${requestScope.array}" var="item" >
        ${ item } <br/>
    </c:forEach>

    <%-- 3.遍历map集合 --%>
    <%
        Map<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        request.setAttribute("map",map);
    %>
    <c:forEach items="${requestScope.map}" var="item">
        ${item.key} : ${item.value} <br/>
    </c:forEach>

    <%-- 4.遍历List集合 --%>
    <%
        List<student> list = new ArrayList<>();
        for(int i=1;i<11;i++){
            list.add(new student(i,"username"+i,"password"+i,18+i,"phone"));
        }
        request.setAttribute("students",list);
    %>
    <table>
    <c:forEach items="${requestScope.students}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.username}</td>
            <td>${student.age}</td>
            <td>${student.phone}</td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>
