<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/2/9
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>
    <div id="global">
        <h1>书本列表</h1>
        <a href="<c:url value="/book_add"/>">增加一本书</a>
        <table>
            <tr>
                <th>分类</th>
                <th>书名</th>
                <th>ISBN</th>
                <th>作者</th>
                <th>&nbsp;</th>
            </tr>
            <c:forEach items="${books}" var="book">
                <tr>
                    <td>${book.category.name}</td>
                    <td>${book.title}</td>
                    <td>${book.isbn}</td>
                    <td>${book.author}</td>
                    <td><a href="<c:url value="/book_edit/${book.id}"/>">编辑</a></td>
                </tr>
            </c:forEach>
        </table>

    </div>
</body>
</html>