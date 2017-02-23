<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/2/22
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="people_save" method="post" commandName="people">
        <form:errors path="name" cssClass="error"></form:errors><br>
        <label>姓名：</label>
        <form:input path="name" id="name"></form:input><br>
        <form:errors path="age" cssClass="error"></form:errors><br>
        <label>年龄：</label>
        <form:input path="age" id="myAge"></form:input><br>
        <form:errors path="birthday" cssClass="error"></form:errors><br>
        <label>出生日期：</label>
        <form:input path="birthday" id="birthday"></form:input><br>
        <input type="submit" id="submit" value="保存">
    </form:form>
</body>
</html>
