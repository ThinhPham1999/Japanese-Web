<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Admin successful</h1>
	<jsp:useBean id="list" class="bo.UserBO"></jsp:useBean>
	<table border="1">
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>Name</th>
				<th>Date of birth</th>
				<th>Gender</th>
				<th>Permission</th>
			</tr>
			<c:forEach items="${list.listAll()}" var="user">
				<tr>
					<td>${user.userID}</td>
					<td>${user.userName}</td>
					<td>${user.name}</td>
					<td>${user.dob.getDate()}/${user.dob.getMonth()}/${user.dob.getYear() + 1900}</td>
					<td>
						<c:if test =  "${user.gender == 0}">
							<input type="checkbox" name="gender" checked/> 
						</c:if>
						<c:if test =  "${user.gender == 1}">
							<input type="checkbox" name="gender"/> 
						</c:if>
					</td>
					<td>
							<c:if test="${user.permission == 0}">
								ADMIN
							</c:if>
							<c:if test="${user.permission == 1}">
								TEACHER
							</c:if>
							<c:if test="${user.permission == 2}">
								STUDENT
							</c:if>				
					</td>
					<td><a href="changePermission?id=${user.userID}">
					<input type="submit" value="Change"/></a></td>
				</tr>
			</c:forEach>	
		</table>
		<a href="logout">Logout</a>
</body>
</html>