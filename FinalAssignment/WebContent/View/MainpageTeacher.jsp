<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Teacher login successful</h1>
	<s:url id="view" action="viewUpdate"></s:url>
	<s:a href="%{view}">
		<input type="submit" value="Update"/>
	</s:a>
	<a href="/FinalAssignment/View/ChangePassword.jsp">Change password</a>
	<a href="logout">Logout</a>
</body>
</html>