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

    <form action="register" method="post">
        <input type="number" name="id" placeholder="Enter ID" required>
        <input type="text" name="name" placeholder="Enter Name" required>
        <input type="number" name="age" placeholder="Enter Age" required>

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>