<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Info</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }

        body {
            height: 100vh;
            background: linear-gradient(135deg, #667eea, #764ba2);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card {
            background: white;
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
            text-align: center;
            width: 90%;
            max-width: 400px;
        }

        .card h1 {
            color: #333;
            margin-bottom: 15px;
        }

        .name {
            font-size: 24px;
            font-weight: bold;
            color: #667eea;
        }

        .btn {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            background: #667eea;
            color: white;
            border-radius: 8px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover {
            background: #5a67d8;
        }

        @media (max-width: 500px) {
            .card {
                padding: 25px;
            }

            .name {
                font-size: 20px;
            }
        }
    </style>
</head>
<body>

<div class="card">
    <h1>Welcome 👋</h1>

    <!-- Display Name -->
    <p class="name">${name}</p>

    <button class="btn" onclick="alert('Hello ${name}!')">
        Click Me
    </button>
</div>

</body>
</html>