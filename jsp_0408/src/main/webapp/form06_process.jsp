<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="tb.css" type="text/css" rel="stylesheet">
</head>
<body>
	<table>
        <tr>
        	<th>요청 파라미터 이름</th>
        	<th>요청 파라미터 값</th>
        </tr>
        <%
        	request.setCharacterEncoding("utf-8");
        
        	Enumeration paramNames = request.getParameterNames();
        	while (paramNames.hasMoreElements()){
        		String name = (String) paramNames.nextElement();
        		out.print("<tr><td>" + name + " </td>\n");
        		String paramValue = request.getParameter(name);
        		out.println("<td> " +paramValue + "</td></tr>\n");
        		
        	}
        		
        	
        %>
    </table>
</body>
</html>