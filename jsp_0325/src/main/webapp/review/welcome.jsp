<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel ="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

	<%@ include file = "menu.jsp"%>
	<%! String greeting = "�ȳ��ϼ��� ���θ��� ���Ű��� ȯ���մϴ�!"; 
		String tagline = "Welcome to Web Market!";
	%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-4">
				<%=greeting %>
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline %>
			</h3>
		</div>
	</div>
	<%@ include file ="footer.jsp" %>
	

</body>
</html>