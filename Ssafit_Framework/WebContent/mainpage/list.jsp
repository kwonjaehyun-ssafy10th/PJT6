<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운동 영상 목록</title>
</head>
<body>
	<h2>영상 목록</h2>
	<hr>
	<h3>인기순</h3>
	<table>
		<tr>
			<th>영상 번호 </th>
			<th>제목 </th>
			<th>운동부위 </th>
			<th>채널명</th>
			<th>조회수</th>
		</tr>
	
	<c:forEach items="${list}" var="video">
	<tr>
		<td>${video.id }</td>
		<td><a href="main?act=detail&id=${video.id}">${video.title}</td>
		<td>${video.fitPartName }</td>
		<td>${video.channelName }</td>
		<td>${video.viewCnt }</td>
	</tr>
	</c:forEach>
	</table>
	
	
	<h3>부위 선택</h3>
	<form action="main" method="POST">
		<input type="hidden" name="act" value="select">
		<input type="radio" name="part" value = "전신"> 전신<br>
		<input type="radio" name="part"value = "상체"> 상체<br>
		<input type="radio" name="part"value = "하체"> 하체<br>
		<input type="radio" name="part"value = "복부"> 복부<br>
		<br>
		<button>선택</button>
	</form>
	

</body>
</html>