<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: koju
  Date: 2017/02/08
  Time: 10:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试用户列表</title>
</head>
<body>
<table>
    <tr>
        <th style="width: 1100px;">姓名</th>
        <th style="width: 1200px;">年龄</th>
        <th style="width: 1300px;">性别</th>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr>
            <td align="center">${user.username }</td>
            <td align="center">${user.age }</td>
            <td align="center">${user.sex == 0 ? '女':'男'}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
