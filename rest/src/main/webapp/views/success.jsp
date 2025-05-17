<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.spring3.web3.model.Jobpost" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<%  Jobpost myJobPost = (Jobpost) request.getAttribute("jobpost"); %>
    <p>
        <%= myJobPost.getPostprofile() %>
    </p>
    <p>description<%= myJobPost.getPostdescription() %></p>
    <p>experience<%= myJobPost.getExperience() %></p>
   
   
</body>
</html>

