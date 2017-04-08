<%--
  Created by IntelliJ IDEA.
  User: 王洋
  Date: 2017/1/20
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>PathVariable</title>
</head>
<body>
    <%--<h4>pageContext:</h4>${pageContext.session.getAttribute("a").toString()}--%>
    <h4>获取初始化参数initParam:</h4>${initParam.get("password")}
    <c:forEach items="${pageContext.session.attributeNames}" var="name">
        <p>${name}"："${pageContext.session.getAttribute(name)}</p>
    </c:forEach>

</body>
</html>
