<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Create person</h1>

<form:form method="get" commandName="person">
    <form:input path="name"/>
    <form:input path="id"/>
    <form:checkbox path="isAdmin"/>
    <form:errors path="*" />
</form:form>


</body>
</html>
