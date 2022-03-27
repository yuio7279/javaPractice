<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% String name =request.getParameter("name"); %>
	<%=request.getParameter("date") %>

	<%=request.getParameter("id") %>
	<%=URLDecoder.decode(name) %>
</body>
</html>