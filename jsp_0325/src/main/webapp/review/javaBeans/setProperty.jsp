<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	4-9
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request" />
	<jsp:setProperty name="person" property="id" value="20182005" />
	<jsp:setProperty name="person" property="name" value="홍길동" />
	<p> 아이디 : <% out.println(person.getId()); %></p>
	<p> 이 름 : <% out.println(person.getName()); %></p>
	
	
	<jsp:useBean id="person2" class="ch04.com.dao.Person" scope="request"/>
	<jsp:setProperty name="person2" property="id" value="123" />
	<jsp:setProperty name="person2" property="name" value="asdf" />
	<jsp:getProperty name="person2" property="id"/>
	<jsp:getProperty name="person2" property="name"/>
</body>
</html>