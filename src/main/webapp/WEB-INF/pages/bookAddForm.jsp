<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/2/9
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>增加书籍</title>
</head>
<body>
    <div>
        <form:form commandName="book" method="post" action="book_save">
            <fieldset>
                <legend>增加书籍</legend>
                <label for="category">类别</label>
                <form:select id="category" path="category.id" items="${categories}" itemLabel="name" itemValue="id"/>
                <br>
                <label for="title">名称</label>
                <form:input path="title" id="title"></form:input>
                <br>
                <label for="author">作者</label>
                <form:input path="author" id="author"></form:input>
                <br>
                <label for="isbn">ISBN</label>
                <form:input path="isbn" id="isbn"></form:input>
                <br>
                <input type="submit" id="submit" value="增加书籍">
            </fieldset>
        </form:form>
    </div>
</body>
</html>
