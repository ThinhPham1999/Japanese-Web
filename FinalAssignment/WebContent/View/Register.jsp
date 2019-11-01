<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
<sx:head/>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<s:form action="register" namespace="/" method="post">
			<s:hidden name="userID"></s:hidden>
			<s:textfield name="userName" label="Username"></s:textfield>
			<s:password name="userPass" label="Password"></s:password>
			<s:textfield name="name" label="Your name"></s:textfield>
			<sx:datetimepicker name="dob" 
                   label="Select Date"
	           displayFormat="yyyy-MM-dd" value="%{'1999-01-01'}"/>
	        <s:radio label="Gender" name="gender" list="#{'1':'Nam', '2':'Nữ' }" value="1"></s:radio>
	        <s:hidden name="permission" value="2"></s:hidden>
	        <s:submit value="Finsish"></s:submit>
	</s:form>
</body>
</html>