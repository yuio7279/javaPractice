<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp" />
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">상품 등록</h1>
        </div>
    </div>

    <div class="container">
        <form action="processAddProduct.jsp" class="form-horizontal">
            <div class="form-group row">
                <label for="" class="col-sm-2">상품 코드</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="productId">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">상품 명</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="name">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">가격</label>
                <div class="col-sm-3">
                    <input type="text" class="form-control" name="unitPrice">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">상세 정보</label>
                   <div class="col-sm-5">
                        <textarea name="description" id="" cols="50" rows="2" class="form-control">
                        </textarea>
                   </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">제조사</label>
                <div class="col-sm-3">
                    <input type="text" name="manufacturer"class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">분류</label>
                <div class="col-sm-3">
                    <input type="text" name="category" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">재고 수</label>
                <div class="col-sm-3">
                    <input type="text" name="unitsInStock" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label for="" class="col-sm-2">상태</label>
                <div class="col-sm-5">
                    <input type="radio" name="condition" value="New"> 신규 제품 
                    <input type="radio" name="condition" value="Old"> 중고 제품 
                    <input type="radio" name="condition" value="Refurbished"> 재생 제품 
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-offset-2 col-sm-10 ">
                    <input type="submit" value="등록" class="btn btn-primary" >
                </div>
            </div>
        </form>
    </div>
</body>
</html>