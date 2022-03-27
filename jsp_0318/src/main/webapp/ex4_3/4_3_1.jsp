<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<jsp:forward page="param01_data.jsp">
		<jsp:param name="id" value="admin" />
		<jsp:param name="password" value="1234" />
		<jsp:param name="upmu" value='<%=URLEncoder.encode("전산관리자")%>' />
		<jsp:param name="address" value='<%=URLEncoder.encode("인천시")%>' />
	</jsp:forward>
	<p>Java Server Page</p>
</body>
</html>