<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 17.02.2016
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="m" uri="http://www.springframework.org/tags"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
  <div class="logo">
    <a href="index.html"><img src="/resources/images/logo.jpg" title="" /></a>
  </div>
  <!---start-top-nav---->
  <div class="top-menu">
    <div class="search" style="visibility: hidden">
      <form>
        <input type="text" placeholder="" required="">
        <input type="submit" value=""/>
      </form>
    </div>
    <span class="menu"> </span>
    <ul>
      <li class="active"><a href="/index.html"><m:message code="label.header.home" /></a></li>

      <li><a href="/contacts.html"><m:message code="label.header.contact" /></a></li>
      <li><a href="/issues.html"><m:message code="label.header.issues" /></a></li>
      <li><a href="/forum.html"><m:message code="label.header.forum" /></a></li>
      <div class="clearfix"> </div>
    </ul>
  </div>
  <div>
    <a href="?lang=ua">УКР</a> | <a href="?lang=ru">РУС</a>
  </div>
  <div>
    <br>
    <sec:authorize access="isAnonymous()">
      <a href="/login"><m:message code="label.user.login" /></a><span  style="visibility: hidden">| <m:message code="label.user.signup" /></span>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
      <form method="post" action="/logout" id="logoutForm" name="logoutForm">
        <a href="#" onclick="document.logoutForm.submit()"><m:message code="label.user.logout" /></a>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      </form>
    </sec:authorize>
  </div>
  <div class="clearfix"></div>

  <script>
    $("span.menu").click(function(){
      $(".top-menu ul").slideToggle("slow" , function(){
      });
    });
  </script>
  <!---//End-top-nav---->
</div>