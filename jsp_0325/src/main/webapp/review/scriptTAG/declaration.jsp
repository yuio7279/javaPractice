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
	<!-- ���� �±״� �׻� static �Դϴ�. -->
	<%!int data = 5;%>
	<%
	out.println("Value of " + data);
	%>

	<!-- static �޼ҵ� -->
	<%!public int dataA() {
		return data;
	}%>

	<%
	out.println(dataA());
	%>
	<%=dataA()%>

	<!-- ��ũ��Ʋ�� �±״� _jspService() ���ο� ��ġ�Ǿ� ���������� �˴ϴ�. -->
	<%
	int counts = 55;
	%>
	<%
	out.println(++counts);
	%>
	<%
	out.println(++count);
	%>


	<!-- �������� ����ϱ� -->
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