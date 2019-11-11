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
	<s:form action="changePassword" namespace="/" method="post">
		<s:password name="oldpass" label="Old password"></s:password>
		<s:password name="newpass" label="New password"></s:password>
		<s:password name="confirm" label="Confirm password"></s:password>
		<s:submit value="Confirm"></s:submit>
	</s:form>
</body>
</html>