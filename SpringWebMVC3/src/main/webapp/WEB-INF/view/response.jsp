<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Courses</title>

    <style>
        body {
            font-family: Arial;
            background-color: #f5f5f5;
        }

        .container {
            width: 350px;
            margin: 80px auto;
            padding: 20px;
            border-radius: 10px;
            background-color: white;
            box-shadow: 0px 0px 10px gray;
            text-align: center;
        }

        .course {
            padding: 10px;
            margin: 8px 0;
            background-color: #e3f2fd;
            border-radius: 5px;
        }

        .btn {
            margin-top: 15px;
            padding: 8px 15px;
            border: none;
            background-color: black;
            color: white;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Available Courses 🚀</h2>

    <!-- JSTL forEach -->
    <c:forEach var="c" items="${courses}">
        <div class="course">
                ${c}
        </div>
    </c:forEach>

    <!-- Optional button -->
    <button class="btn" onclick="alert('Courses Loaded Successfully!')">
        Response
    </button>
</div>

</body>
</html>