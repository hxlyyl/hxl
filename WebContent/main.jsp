<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="servlet.LoginServlet" import="model.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎！</title>
</head>
<body>
	<%
		User user = (User)session.getAttribute("user");
		String username = user.getUsername();
	%>
	<%= username %>,你好！
</body>
</html>