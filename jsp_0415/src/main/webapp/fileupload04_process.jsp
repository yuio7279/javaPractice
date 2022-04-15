<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<%
		String path = "C:\\upload";								//저장경로
	
		DiskFileUpload upload = new DiskFileUpload();			//Commons-FileUpload패키지의 업로드용클래스
																
	
		upload.setSizeMax(1000000);								//파일 최대크기
		upload.setSizeThreshold(4096);							//메모리에 저장할 최대 크기
		upload.setRepositoryPath(path);							//저장경로
		
		List items = upload.parseRequest(request);			//요청을 받았다
		Iterator params = items.iterator();					//이터레이터타입으로 변환 내부내용을 까내기 용이
		
		while (params.hasNext()){
			FileItem item = (FileItem) params.next();				//FileItem타입 파일처리용
			if(item.isFormField()){									//요청받았던 파일 여부판단 : 요청받지않은 일반데이터
				String name = item.getFieldName();
				String value = item.getString("utf-8");				//받을 인코딩 형태
				out.println(name + "=" + value + "<br>");
			}
			else {
				String fileFieldName = item.getFieldName();			//요청받았던 파일
				String fileName = item.getName();
				String contentType = item.getContentType();			//파일 콘텐츠 유형
				
				fileName = fileName.substring(fileName.lastIndexOf("//") + 1);	//깔끔하게 자르기
				long fileSize = item.getSize();						//파일 크기
				
				File file = new File(path+"/"+fileName);
				item.write(file);
				
				out.println("-------------------------<br>");
				out.println("요청 파라미터 이름 : " + fileFieldName + "<br>");
				out.println("저장 파일 이름 : " + fileName + "<br>");
				out.println("파일 콘텐츠 유형 : " + contentType + "<br>");
				out.println("파일 크기 : " + fileSize);
			}
		}
	
	
	
	%>
 </body>
</html>