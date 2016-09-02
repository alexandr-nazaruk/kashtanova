<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 17.02.2016
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="m" uri="http://www.springframework.org/tags"  %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<div class="container">
  <div class="content-grids">
    <div class="col-md-8 content-main">
      <div class="content-grid">

        <c:forEach items="${postList}"  var="post">
          <div class="content-grid-info">
            <img src="resources/images/post1.jpg" alt=""/>
            <div class="post-info">
              <h4><a href="/post/${post.id}">${post.title}</a>  ${post.publicationDate}  </h4>
              <p>${post.text}</p>
              <a href="/post/${post.id}" style="visibility: hidden"><span></span><m:message code="label.post.readMore" /></a>
              <sec:authorize access="hasAnyRole('ROLE_EDITOR')">
                <a href="/post/${post.id}?edit" style="float: right"><m:message code="label.post.edit" /></a>
              </sec:authorize>
            </div>
          </div>
        </c:forEach>

      </div>
    </div>

    <div class="col-md-4 content-right">
      <sec:authorize access="hasAnyRole('ROLE_EDITOR')">
        <div>
          <h3><a href="/post/edit" style="color: #00aeff"><m:message code="label.post.add" /></a></h3>
         <br>
        </div>
      </sec:authorize>

      <div class="favorites" >
        <h3><m:message code="label.post.favorite" /></h3>
        <ul>
          <c:forEach items="${favoritePostList}"  var="post">
            <li><a href="#">${post.title}</a></li>
          </c:forEach>
        </ul>
      </div>

      <div class="recent" style="visibility: hidden">
        <h3><m:message code="label.post.recentPosts" /></h3>
        <ul>
          <li><a href="#">Aliquam tincidunt mauris</a></li>
          <li><a href="#">Vestibulum auctor dapibus  lipsum</a></li>
          <li><a href="#">Nunc dignissim risus consecu</a></li>
          <li><a href="#">Cras ornare tristiqu</a></li>
        </ul>
      </div>
     <div class="comments" style="visibility: hidden">
        <h3><m:message code="label.post.recentComments" /></h3>
        <ul>
          <li><a href="#">Amada Doe </a> on <a href="#">Hello World!</a></li>
          <li><a href="#">Peter Doe </a> on <a href="#"> Photography</a></li>
          <li><a href="#">Steve Roberts  </a> on <a href="#">HTML5/CSS3</a></li>
        </ul>
      </div>
      <div class="archives" style="visibility: hidden">
        <h3><m:message code="label.post.archive" /></h3>
        <ul>
          <li><a href="#">October 2013</a></li>
          <li><a href="#">September 2013</a></li>
          <li><a href="#">August 2013</a></li>
          <li><a href="#">July 2013</a></li>
        </ul>
      </div>
      <div class="clearfix"></div>
    </div>
    <div class="clearfix"></div>
  </div>
</div>