<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book add</title>
</head>
<body>

<%--@elvariable id="books" type=""--%>
<form:form method="post"
           modelAttribute="books">
    <form:input path="isbn"/>
    <form:errors path="isbn"/><br/>
    <form:input path="title"/>
    <form:errors path="title"/><br/>
    <form:input path="author"/>
    <form:errors path="author"/><br/>
    <form:input path="publisher"/>
    <form:errors path="publisher"/><br/>
    <form:input path="type"/>
    <form:errors path="type"/><br/>
    <input type="submit" value="Save">
</form:form>

</body>
</html>


