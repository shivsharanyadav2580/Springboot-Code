<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        body {
            font-family: Arial;
            background: linear-gradient(135deg, #667eea, #764ba2);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-box {
            background: white;
            padding: 30px;
            border-radius: 10px;
            width: 300px;
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #667eea;
            color: white;
            border: none;
        }
    </style>
</head>
<body>

<div class="form-box">
    <h2>Student Form</h2>

    <%@ taglib prefix="/form" uri="http://www.springframework.org/tags/form" %>

    <form:form action="register" method="post" modelAttribute="studentData">

        ID: <form:input path="id"/><br><br>

        Name: <form:input path="name"/><br><br>

        Age: <form:input path="age"/><br><br>

        <button type="submit">Submit</button>

    </form:form>
</div>

</body>
</html>