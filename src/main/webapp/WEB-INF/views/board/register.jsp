<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	제목:<input type="text" name="title"><br>
	내용:<textarea rows="3" name='content'></textarea><br>
	작성자:<input type="text" name="writer"><br>
	<input type="submit" value="등록">
</form>
</body>
</html>