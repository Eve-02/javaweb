<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page autoFlush="true" buffer="8kb" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
  <%!
    private int id;
    private int age;
    private String name;
    private static Map<String,Object> map;
  %>

  <%!
    static{
      map = new HashMap<>();
      map.put("key1","value1");
      map.put("key2","value1");
    }
  %>

  <%!
    public void test(){
      System.out.println(map.get("key1"));
    }

    public int getId(){
      return id;
    }
  %>

  <%!
    public static class A{
      private Integer id;
      private String name;
    }
  %>

  <%=12 %> <br/>
  <%=12.12 %>
  <%="我是字符串" %>
  <%=map %>

  <%=request.getParameter("username") %>

  <%=5+3%>

  <%
    int i=12;
    if(i==12){
      System.out.println(i);
    }else{
      System.out.println("121212");
    }
  %>

  <%
    for(int j=0;j<10;j++){
      if(j==8){
        System.out.println("89");
      }
    }
  %>

  <%
    System.out.println(request.getParameter("username"));
  %>

  <%
    int we = 100;
  %>

  <%
    System.out.println(we);
  %>

  <!-- 这是html注释，会被翻译到时out.writer() -->

  <%
    // 单选注释
    /*
      多选注释
      (会被翻译到java原代码中)
     */
  %>

  <%-- 这是jsp注释 --%>

</body>
</html>
