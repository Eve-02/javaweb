<%@ page import="test.student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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
        var: 表示开始的索引，从第几条数据开始
        [begin=0 表示从第一条数据开始; end=6包含索引为6的数据]

        step: 表示步行值 i++
        [step=2 等同于 i+=2]

        varStatus: 表示遍历的数据的状态
    --%>

    <%-- 4.遍历List集合 --%>
    <%
        List<student> list = new ArrayList<>();
        for(int i=1;i<11;i++){
            list.add(new student(i,"username"+i,"password"+i,18+i,"phone"));
        }
        request.setAttribute("students",list);
    %>

    <table>
        <c:forEach begin="0" end="6" step="2" varStatus="status" items="${requestScope.students}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.username}</td>
                <td>${student.age}</td>
                <td>${student.phone}</td>

                <%-- 对象 --%>
                <td>${status.current}</td>
                <%-- 下标 --%>
                <td>${status.index}</td>
                <%-- 个数 --%>
                <td>${status.count}</td>
                <%-- 是否是第一条数据、最后一条数据 --%>
                <td>${status.first}</td>
                <td>${status.last}</td>
                <%-- 获取begin、end、step属性值 --%>
                <td>${status.begin}</td>
                <td>${status.end}</td>
                <td>${status.step}</td>

            </tr>
        </c:forEach>
    </table>
</body>
</html>
