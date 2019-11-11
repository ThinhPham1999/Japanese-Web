<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<sb:head/>
<meta charset="UTF-8">
<title>Login page</title>
</head>
<body>
	<nav>
		<s:form action="login" namespace="/" method="post" theme="bootstrap" cssClass="well form-vertical">
			<s:textfield name="username" label="Username"></s:textfield>
			<s:password name="pass" label="Password"></s:password>
			<s:submit value="Login" cssClass="btn btn-primary"></s:submit>
			<s:url value="View/Register.jsp" var="Register" />
			<s:a href="%{Register}">Register here</s:a>
		</s:form>
	</nav>
</body>
</html>