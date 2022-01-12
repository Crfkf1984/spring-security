<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 12.01.2022
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Information for all Emplees</h3>
<br>
<br>
<security:authorize access= "hasRole('HR')">
<input type="button" value="Salary" onclick="window.location.href='hr_info'">
Only for HR staff
</security:authorize>
<br>
<br>
<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance" onclick="window.location.href='manager_info'">
Only for MANAGER staff
</security:authorize>
</body>
</html>
