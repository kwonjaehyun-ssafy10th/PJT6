<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 수정</title>
</head>
<body>
<h2>리뷰 수정</h2>
	<hr>
	<form action="main" method="POST">
		<input type="hidden" name="act" value="update">		
		<input type="hidden" name="reviewId" value="${review.reviewId}">
		영상 번호 : <input type="text" name="videoId" readonly value = "${review.videoId}"> <br>
		작성자 : <input type="text" name="writer" readonly value="${review.writer}"> <br>
		내용 : <input type="text" name ="content">${review.content}<br>
		<button>수정</button>
	</form>
</body>
</html>