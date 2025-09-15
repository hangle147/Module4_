<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 14/09/2025
  Time: 10:30 CH
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
<form action="<c:url value='/players/add'/>" method="post">
    <label>ID: </label>
    <input type="text" name="id"><br>
    <label>Họ và tên: </label>
    <input type="text" name="fullName"><br>
    <label>Ngày sinh: </label>
    <input type="date" name="dayOfBirth"><br>
    <label>Kinh nghiệm: </label>
    <input type="text" name="experience"><br>
    <label>Vị trí: </label>
    <input type="text" name="position"><br>
    <label>Link ảnh đại diện: </label>
    <input type="text" name="avatar"><br>
    <button type="submit">SAVE</button>
</form>
</body>
</html>
