<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<%@ include file = "menu.jsp"%>
	<%! String greeting2 = "����� �ϸ��� �Դϴ�."; 
		String tagline2 = "����� �±׶����Դϴ�.";
	%>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4"><%= greeting2 %></h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%= tagline2 %>
			</h3>
		</div>
	</div>
	 <%@ include file ="footer.jsp" %>
	
</body>
</html>