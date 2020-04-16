<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style></style>
<script></script>
</head>
<body>
<form method="post" action="/board/register">
	제목:<input type="text" name="title" value="${board.title }" readonly><br>
	내용:<textarea rows="3" name='content' readonly><c:out value='${board.content }'/></textarea><br>
	작성자:<input type="text" name="writer" value="${board.writer }" readonly><br>
</form>
</body>
</html>