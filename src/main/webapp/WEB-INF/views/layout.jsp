<%--
  Created by IntelliJ IDEA.
  User: onazaruk
  Date: 17.02.2016
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Kashtanova 14b</title>
  <link href="/resources/css/bootstrap.css" rel='stylesheet' type='text/css' />
  <link href="/resources/css/style.css" rel='stylesheet' type='text/css' />
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Personal Blog Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"
          />
  <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  <!----webfonts---->
  <link href='http://fonts.googleapis.com/css?family=Oswald:100,400,300,700' rel='stylesheet' type='text/css'>
  <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,300italic' rel='stylesheet' type='text/css'>
  <!----//webfonts---->
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
  <!--end slider -->
  <!--script-->
  <script type="text/javascript" src="/resources/js/move-top.js"></script>
  <script type="text/javascript" src="/resources/js/easing.js"></script>
  <!--/script-->
  <script type="text/javascript">
    jQuery(document).ready(function($) {
      $(".scroll").click(function(event){
        event.preventDefault();
        $('html,body').animate({scrollTop:$(this.hash).offset().top},900);
      });
    });
  </script>
  <!---->

</head>
<body>
<!---header---->
<div class="header">
  <tiles:insertAttribute name="header" />
</div>
<!--/header-->
<div class="content">
  <tiles:insertAttribute name="content" />
</div>
<!---->
<div class="footer">
  <tiles:insertAttribute name="footer" />
</div>
