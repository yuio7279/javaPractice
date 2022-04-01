<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
		
		if(userID.equals("관리자") && password.equals("1234")){
			response.sendRedirect("response01_success.jsp");
		}
		else
		{
			response.sendRedirect("response01_failed.jsp");
		}
	%>
	<p> 아이디 : <%= userID %>
	<p> 비밀번호 : <%= password %>
</body>
</html>