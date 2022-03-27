<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
int count = 0;
%>
<body>
	<!-- 선언문 태그는 항상 static 입니다. -->
	<%!int data = 5;%>
	<%
	out.println("Value of " + data);
	%>

	<!-- static 메소드 -->
	<%!public int dataA() {
		return data;
	}%>

	<%
	out.println(dataA());
	%>
	<%=dataA()%>

	<!-- 스크립틀릿 태그는 _jspService() 내부에 배치되어 지역변수가 됩니다. -->
	<%
	int counts = 55;
	%>
	<%
	out.println(++counts);
	%>
	<%
	out.println(++count);
	%>


	<!-- 지역변수 사용하기 -->
	<%
	int a= 2;
	int b= 3;
	int sum = a+b;
	out.println(sum);
	%>
	
	<%
		for(int i=0; i<=10; i++)
			if(i%2==0)
				{
				out.println(i);
				out.print(i+1);
				}
	%>
	
	
	

</body>
</html>