<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 18.02.2016
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<div class="content">

  <h1>this page is not used</h1>

  <sf:form action="/j_spring_security_check">
    Login: <sf:input path="j_username"/>
    Password: <sf:password path="j_password" />
    rememver me <sf:checkbox path="_spring_security_remember_me"/>
  </sf:form>
</div>