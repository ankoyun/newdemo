<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
<title>web开发技术</title>    
<link rel="stylesheet" href="bootstrap-4.4.1-dist/css/bootstrap.min.css">    
<script src="bootstrap-4.4.1-dist/jquery-3.0.0.min.js"></script>    
<script src="bootstrap-4.4.1-dist/popper.min.js"></script>   
<script src="bootstrap-4.4.1-dist/js/bootstrap.min.js"></script>    
</head>
<body>
<!-- 页面布局 -->
<%@include file="nav.jsp" %>

    <div class="container">
    	
    	<div class="row" style="margin-top: 10px;">
    	
        	<div class="col-md-3">
                <%@include file="left.jsp" %>

       		</div>
       	 <div class="col-md">
				<div class="jumbotron">
				  <h1 class="display-4">Hello, world!</h1>
				  <p class="lead">This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.</p>
				  <hr class="my-4">
				  <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
				  <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
				</div>
  		</div>
        <div class="col-md-3">
        	<%@include file="right.jsp" %>
        </div>
    </div>
</body>
</body>
</html>