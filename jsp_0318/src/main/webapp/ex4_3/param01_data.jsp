<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.net.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	
	아이디 :
	<%=request.getParameter("id")%><br><br>
	비밀번호 :
	<%=request.getParameter("password")%><br><br>
	담당업무 :
	<%=URLDecoder.decode(request.getParameter("upmu"))%><br><br>
	주소 :
	<%=URLDecoder.decode(request.getParameter("address"))%><br><br> 
</body>
</html>