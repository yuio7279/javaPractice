<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "dbconn.jsp" %>
<% 
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");
	
	Statement stmt = null;
	
	try {
		String sql = "insert into member(id, passwd, name) values('"+id+"','"+passwd+"','"+name+"')";
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		out.println("Member 테이블 삽입이 성공했습니다.");
	}
	catch (SQLException e){
		
		out.println("Member 테이블 삽입이 실패했습니다.");
		out.println("SQLException : "+e.getMessage());
	} finally {
		if (stmt != null)
			stmt.close();
		if (conn != null)
			conn.close();
	}

%>
</body>
</html>