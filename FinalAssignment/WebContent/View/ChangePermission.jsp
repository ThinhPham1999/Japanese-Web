<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatePermission">
		<input name="id" type="hidden" value="${user.userID}"/><br>
		<label>Nickname: ${user.userName}</label><br>
		<label>Name: ${user.name}</label><br>
		<label>Date of birth: ${user.dob.getDate()}/${user.dob.getMonth()}/${user.dob.getYear() + 1900}</label><br>
		<label>
			<c:if test =  "${user.gender == 0}">
				Gender: Nam
			</c:if>
			<c:if test =  "${user.gender == 1}">
				Gender: Nữ
			</c:if>
		</label><br>
		<s:select label="Permission" 
			list="#{'0':'Admin', '1':'Teacher', '2':'Student'}" 
			name="permission" 
			value="%{user.permission}" /><br>
		<input type="submit" value="Change">
	</form>
</body>
</html>