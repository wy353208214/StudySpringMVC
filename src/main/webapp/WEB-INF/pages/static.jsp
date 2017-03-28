<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/1/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>PathVariable</title>
</head>
<body>
    <h4>pageContext:</h4>${pageContext.session.getAttribute("a").toString()}
    <br>
    <h4>initParam:</h4>${initParam.get("password")}
</body>
</html>
