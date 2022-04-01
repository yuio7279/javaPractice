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
		<form action="out02.process.jsp" method="post">
			<p> 아이디 : <input type="text" name="id">
			<p> 비밀번호 : <input type="text" name="passwd">
			<p> <input type="submit" value="전송" />
		</form>
</body>
</html>