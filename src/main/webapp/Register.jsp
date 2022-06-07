<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctp" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<h2 align="center">회원 가입 화면</h2>
	<form action="${ctp}/memberInsert.do" method="post">
		<table class="table table-hover" style="width: 400px" align="center">
			<tr>
				<td>아이디</td>
				<td align="center"><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td align="center"><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td align="center"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td align="center"><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td align="center"><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td align="center"><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="전송"
					class="btn btn-success" /> <input type="reset" value="취소"
					class="btn btn-danger" /></td>
			</tr>
		</table>
	</form>
</body>
</html>