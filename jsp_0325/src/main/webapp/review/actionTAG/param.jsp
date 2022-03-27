<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="param2.jsp">
	<jsp:param value="<%=new java.util.Date() %>" name="date"/>
</jsp:include>

<jsp:include page="param2.jsp">
	<jsp:param value="admin" name="id" />
	<jsp:param value='<%= URLEncoder.encode("관리자") %>' name="name"/>
</jsp:include>
</body>
</html>