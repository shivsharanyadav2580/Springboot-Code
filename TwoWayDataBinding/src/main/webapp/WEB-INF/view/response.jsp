<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <style>
        body {
            font-family: Arial;
            background: linear-gradient(135deg, #36d1dc, #5b86e5);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .card {
            background: white;
            padding: 30px;
            border-radius: 10px;
            text-align: center;
        }

        h2 {
            margin-bottom: 15px;
        }
    </style>
</head>
<body>

<div class="card">
    <h2>Student Details 🎓</h2>

    <p>ID: ${studentData.id}</p>
    <p>Name: ${studentData.name}</p>
    <p>Age: ${studentData.age}</p>
</div>

</body>
</html>