<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<sx:head/>
<sb:head/>
<sj:head/>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="update" namespace="/" method="post"  theme="bootstrap" cssClass="well form-vertical">
			<s:hidden name="userID" value="%{user.userID}"></s:hidden>
			<s:hidden name="userName" value="%{user.userName}"></s:hidden>
			<s:hidden name="userPass" label="Password" value="%{user.userPass}"></s:hidden>
			<s:textfield name="name" label="Your name" value = "%{user.name}"></s:textfield>
			<s:label value="Select date"></s:label>
			<sj:datepicker name="dob"
                           id="datepicker"
                           parentTheme="bootstrap"
                           cssClass="form-control"
                           showOn="focus"
                           inputAppendIcon="calendar"
                           value="%{user.dob}"
                        />
	        <s:radio label="Gender" name="gender" list="#{'0':'Nam', '1':'Nữ' }" value="%{user.gender}"></s:radio>
	        <s:hidden name="permission" value="%{user.permission}"></s:hidden>
	     
	        <s:submit value="Update" cssClass="btn btn-primary"></s:submit>
	</s:form>
</body>
</html>