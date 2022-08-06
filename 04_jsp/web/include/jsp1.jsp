<%@ page import="java.util.List" %>
<%@ page import="pojo.student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
      List<student> list = new ArrayList<>();
      for(int i=0;i<10;i++){
          list.add(new student(i+1,"name"+(i+1),18+(i+1)));
      }
    %>

    <table>
    <%
        for (student student : list) {
            %>
        <%
        }
    %>
    </table>
</body>
</html>
