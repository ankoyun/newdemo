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
  				<div class="jumbotron">用户列表${users[0].username}</div>
				   <table class="table table-striped">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">活动名称</th>
					      <th scope="col">活动时间</th>
					      <th scope="col">报名时间</th>
					      <th scope="col">报名状态</th>
					       <th scope="col">操作</th>
					    </tr>
					  </thead>
					  <tbody>
					  <c:forEach items="${hdlist}" var="hd">
					    <tr>
					      <th scope="row">${hd.id}</th>
					      <td>${hd.activityname}</td>
					      <td>${hd.activitytime}</td>
					      <td>${hd.starttime}至${hd.endtime}</td>
					      <td>
					      <a type="button" href ="admin/UserInfo?id=${item.id} "class="btn btn-info">详情</a>
					      <a type="button" href ="admin/UserInfo?id=${item.id} "class="btn btn-info">修改用户信息</a>
					      </td>
					    </tr>
			           </c:forEach>
					  </tbody>
					</table>
				  </div>
				</div>
  		</div>
    
    </div>
</body>
</body>
</html>