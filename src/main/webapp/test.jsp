<%@ page import="org.b14.test.Test" %>
<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 11.02.2016
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>

<%
org.b14.test.Test t= new org.b14.test.Test();
 // out.write(t.test(""));
  out.write("\n Spring: ");
  //out.write(t.testSpringJdbc());
%>
<b>greeting: ${greeting}</b>

</body>
</html>
