<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 15.02.2016
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<sf:form method="post" modelAttribute="user">
  <table>
    <tr>
      <td>Name:</td><td><sf:input path="name"/><br></td>
    </tr>
    <tr>
      <td>Password:</td><td><sf:password path="password" /></td>
    </tr>
    <tr>
      <td>Apartment:t</td><td><sf:input path="apartment" /></td>
    </tr>
    <tr>
      <td>E-mail:</td><td><sf:input path="email" /></td>
    </tr>
  </table>
  <input type="Submit" value="Submit"/>
</sf:form>



</body>
</html>