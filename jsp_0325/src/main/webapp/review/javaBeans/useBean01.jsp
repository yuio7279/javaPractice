<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="date" class="java.util.Date"/>
	<jsp:useBean id="cal" class="dto.Cal"/>
	<p>
		<%=date %>
		<%=cal.process(3) %>
		
	</p>
</body>
</html>