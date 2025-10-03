<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/09/2025
  Time: 4:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Thêm mới</h1>
<form action="<c:url value='/students/add'/>" method="post">
    <label>ID: </label>
    <input type="text" name="id"><br>
    <label>Name: </label>
    <input type="text" name="name"><br>
    <button type="submit">save</button>
</form>
</body>
</html>
