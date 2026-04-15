<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
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
            background: linear-gradient(135deg, #36d1dc, #5b86e5);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card {
            background: #fff;
            padding: 35px;
            border-radius: 15px;
            width: 90%;
            max-width: 420px;
            text-align: center;
            box-shadow: 0 10px 25px rgba(0,0,0,0.2);
        }

        h1 {
            margin-bottom: 20px;
            color: #333;
        }

        .info {
            font-size: 20px;
            margin: 10px 0;
            color: #555;
        }

        .highlight {
            font-weight: bold;
            color: #5b86e5;
        }

        .btn {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            background: #5b86e5;
            color: white;
            border-radius: 8px;
            cursor: pointer;
        }

        .btn:hover {
            background: #4a6fd1;
        }

        @media (max-width: 500px) {
            .card {
                padding: 25px;
            }
        }
    </style>
</head>
<body>

<div class="card">
    <h1>User Details 👤</h1>

    <!-- Show Name -->
    <p class="info">
        Name: <span class="highlight">${name}</span>
    </p>

    <!-- Show City -->
    <p class="info">
        City: <span class="highlight">${city}</span>
    </p>

    <button class="btn" onclick="alert('Welcome ${name} from ${city}!')">
        Greet
    </button>
</div>

</body>
</html>