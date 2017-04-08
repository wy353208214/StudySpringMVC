<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/4/8
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <th>ID</th>
                <th>年龄</th>
                <th>姓名</th>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.age}</td>
                    <td>${user.name}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
