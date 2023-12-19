<%--작성일 : 2023-12-18--%>

<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
    <link href="<c:url value="/resources/css/bootstrap.min.css"/>"
          rel="stylesheet">
    <title>도서 목록</title>
</head>
<body>
<%--네비게이션 바를 추가하고, "Home" 링크를 포함.--%>
<nav class="navbar navbar-expand  navbar-dark bg-dark">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="./home">Home</a>
        </div>
    </div>
</nav>

<%--페이지의 제목을 보여주는 Jumbotron 컴포넌트를 추가--%>
<div class="jumbotron">
    <div class="container">
        <h1 class="display-3">도서 목록</h1>
    </div>
</div>

<%--도서 목록을 보여주는 부분. 각 도서는 이름, 저자, 출판사, 출판일, 설명의 일부, 가격을 보여줌.--%>
<div class="container">
    <div class="row" align="center">
        <c:forEach items="${bookList}" var="book">
            <div class="col-md-4">
                <h3>${book.name}</h3>
                <p>${book.author}
                    <br> ${book.publisher} | ${book.releaseDate}
                <p align=left>${fn:substring(book.description, 0, 100)}...
                <p>${book.unitPrice}원
            </div>
        </c:forEach>
    </div>
    <hr>
    <footer>
        <p>&copy; BookMarket</p>
    </footer>
</div>
</body>
</html>