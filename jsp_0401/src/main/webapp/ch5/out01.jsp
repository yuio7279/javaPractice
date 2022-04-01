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
			out.println("오늘의 날짜 및 시각 " + "<br>");
			out.println(Calendar.getInstance().getTime());
		%>
</body>
</html>