<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>direction tag</title>
</head>
<body>

<%! 
	int pageCount = 0;
void addCount()
{
	pageCount++;
	
}
%>

<%
	addCount();
%>
<p>
	이 사이트 방문은 <%=pageCount %>번째 입니다.
</p>

</body>
</html>