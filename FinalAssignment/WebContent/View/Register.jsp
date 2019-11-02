<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
<head>
<sx:head/>
<sb:head/>
<sj:head/>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
	<s:form action="register" namespace="/" method="post"  theme="bootstrap" cssClass="well form-vertical">
			<s:hidden name="userID"></s:hidden>
			<s:textfield name="userName" label="Username"></s:textfield>
			<s:password name="userPass" label="Password"></s:password>
			<s:textfield name="name" label="Your name"></s:textfield>
			<s:label value="Select date"></s:label>
			<sj:datepicker name="dob"
                           id="datepicker"
                           parentTheme="bootstrap"
                           cssClass="form-control"
                           showOn="focus"
                           inputAppendIcon="calendar"
                        />
	        <s:radio label="Gender" name="gender" list="#{'1':'Nam', '2':'Nữ' }" value="1"></s:radio>
	        <s:hidden name="permission" value="2"></s:hidden>
	        <s:submit value="Finsish" cssClass="btn btn-primary"></s:submit>
	</s:form>
</body>
</html>