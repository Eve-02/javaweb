<%@ page import="test.person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        person p = new person();
        p.setName("12345");
        p.setPhone(new String[]{"123123123","234234234","456456456"});
        List<String> cities = new ArrayList<>();
        cities.add("a");
        cities.add("b");
        cities.add("c");
        p.setCities(cities);
        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        p.setMap(map);
        request.setAttribute("person",p);

    %>

    <%-- 不是找的属性，而是找属性对应的方法 --%>
    ${person} <br/>
    ${person.name} <br/>
    ${person.phone[1]} <br/>
    ${person.cities} <br/>
    ${person.cities[2]} <br/>
    ${person.map} <br/>
    ${person.map.key2} <br/>

</body>
</html>
