<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
		<%
			request.setCharacterEncoding("utf-8");
		String userID = request.getParameter("id");
		String password = request.getParameter("passwd");
		%>
		<p> 아이디 : <% out.println(userID); %>
		<p> 비밀번호 : <% out.println(password); %>
</body>
</html>