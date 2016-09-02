<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 17.02.2016
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="m" uri="http://www.springframework.org/tags"  %>

<div class="container">
<div class="content-form">
  <sf:form modelAttribute="post" method="post" >

    <sf:hidden path="author"/>
    <m:message code="label.post.title" />
    <sf:input path="title" size="150" /><sf:errors path="title"/><br>
    <m:message code="label.post.text" /><br>
    <sf:textarea path="text" cols="149" rows="20"/><br>
    <input type="submit" value="submit">
  </sf:form>
</div>
</div>