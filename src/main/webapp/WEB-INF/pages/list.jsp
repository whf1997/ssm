<%--
  Created by IntelliJ IDEA.
  User: HW
  Date: 2020/5/22
  Time: 22:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有账户</h3>
<%--    ${list}--%>
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
