<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
    <link rel="icon" type="image/x-icon" href="/icon.jpg"/>
    <title>Books</title>
</head>
<body>
<b>Список книг <br> </b>

<c:forEach items="${books}" var="book">
    <c:if test="${book.year < 2010}">
        ${book.title}
        ${book.year} <br>
    </c:if>
</c:forEach>

<form action="logout" method="get">
    <br> <input type="submit" value="Выйти"/>
</form>

</body>
</html>