<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영상 정보</title>
</head>
<body>
	<h2>상세 내용</h2>
	<hr>
	<div>영상번호 : ${video.id}</div>
	<div>제목 : ${video.title}</div>
	<div>운동 부위 : ${video.fitPartName}</div>
	<div>채널명 : ${video.channelName}</div>
	<div>조회수 : ${video.viewCnt}</div>

	<h3>리뷰</h3>
	<c:forEach items="${reviewList}" var="review">
		<table>
			<tr>
				<th>리뷰번호</th>
				<th>작성자</th>
				<th>내용</th>
				<th>리뷰 수정</th>
			</tr>
			<tr>
				<td>${review.reviewId }</td>
				<td>${review.writer }</td>
				<td>${review.content }</td>
				<td><a href="main?act=updateform&reviewId=${review.reviewId}">수정</a></td>
			</tr>
		</table>
	</c:forEach>

	<div>
		<a href="main?act=registform&reviewId=${video.id}">리뷰 등록</a>
	</div>
	<hr>
	<div>
		<a href="main?act=list">목록으로</a>
	</div>



</body>
</html>