<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.net.URLDecoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ֹ� �Ϸ�</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css"/>
</head>
<body>
	<%
		String cartId = session.getId();
		String shipping_cartId = "";
		String shipping_name = "";
		String shipping_shippingDate = "";
		String shipping_country = "";
		String shipping_zipCode = "";
		String shipping_addressName = "";
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null)
		{
			for(int i =0; i< cookies.length; i++){
				Cookie thisCookie = cookies[i];
				String n = thisCookie.getName();
				if (n.equals("Shipping_cartId")){
					shipping_cartId = URLDecoder.decode((thisCookie.getValue()),"utf-8");
				}
				
				if (n.equals("Shipping_shipingDate")){
					shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()),"utf-8");
				}
			}
		}
	%>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">�ֹ� �Ϸ�</h1>
		</div>
	</div>
	<div class="container">
       <h2 class="alert alert-danger">�ֹ����ּż� �����մϴ�.</h2>
       <p> �ֹ��� <% out.println(shipping_shippingDate);%>�� ��۵� �����Դϴ�.</p>
       <p> �ֹ���ȣ : <% out.println(shipping_cartId);%></p>
   </div>
   <div class="container">
       <p><a href="./products.jsp" class="btn btn-secondary">&laquo; ��ǰ ���</a></p>
   </div>
</body>
</html>
<%
	session.invalidate();
	
	for(int i=0; i<cookies.length; i++){
		Cookie thisCookie = cookies[i];
		String n = thisCookie.getName();
		if(n.equals("Shipping_cartId"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_name"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_shippingDate"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_country"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_zipCode"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_addressName"))
			thisCookie.setMaxAge(0);
		
		response.addCookie(thisCookie);
	}
%>