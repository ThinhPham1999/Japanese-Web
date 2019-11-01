<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<s:form action="login" namespace="/" method="post">
		<s:textfield name="usename" label="Username"></s:textfield>
		<s:password name="pass" label="Password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>
	<s:url value="View/Register.jsp" var="Register" />
	<s:a href="%{Register}">Register here</s:a>
</body>
</html>