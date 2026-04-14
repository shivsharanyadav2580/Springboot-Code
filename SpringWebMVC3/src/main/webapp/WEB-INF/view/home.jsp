<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Home Page</title>
</head>
<body>

<h2>Welcome to Home Page 🚀</h2>

<!-- Simple JSTL Example -->
<c:set var="name" value="Shivsharan"/>

<p>Hello, ${name} 👋</p>

<!-- JSTL Loop Example -->
<c:set var="items" value="${['Java', 'Spring', 'JSTL']}"/>

<h3>Technologies:</h3>
<ul>
    <c:forEach var="tech" items="${items}">
        <li>${tech}</li>
    </c:forEach>
</ul>

</body>
</html>