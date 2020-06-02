<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list.jsp</title>
</head>
<body>

	<h1>Unit Converter</h1>

	<button style="WIDTH: 60pt; HEIGHT: 30pt"
		onclick="location.href='/board/register'">Click to Start</button>
	<!-- start table -->
	<table border="1">
		<thead>
			<tr>
				<th>bno</th>
				<th>From Unit</th>
				<th>Expression</th>
				<th>To Unit</th>
				<th>Registration Date</th>
			</tr>
		</thead>
		<!-- start jstl loop -->
		<c:forEach items="${list}" var="board">
			<tr>
				<td><c:out value="${board.bno}" /></td>
				<td><c:out value="${board.fromunit}" /></td>
				<td><c:out value="${board.expression}" /></td>
				<td><c:out value="${board.tounit}" /></td>
				<td><c:out value="${board.regdate}" /></td>
			</tr>
		</c:forEach>
		<!-- end jstl loop -->
	</table>
	<!-- end table -->

</body>
</html>
