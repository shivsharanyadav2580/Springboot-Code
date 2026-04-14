<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring MVC Interactive Page</title>

    <!-- Bootstrap for responsive UI -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #667eea, #764ba2);
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .card {
            border-radius: 20px;
            padding: 30px;
            box-shadow: 0 15px 30px rgba(0,0,0,0.2);
            text-align: center;
            animation: fadeIn 1s ease-in-out;
        }

        @keyframes fadeIn {
            from {opacity: 0; transform: translateY(20px);}
            to {opacity: 1; transform: translateY(0);}
        }

        .message-box {
            font-size: 20px;
            font-weight: bold;
            color: #4a00e0;
            margin-top: 15px;
        }

        .btn-custom {
            border-radius: 25px;
        }
    </style>
</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <div class="card bg-white">

                <h2 class="mb-3">🚀 Spring MVC Page</h2>

                <!-- Message from Controller -->
                <div class="message-box" id="msg">
                    ${message}
                </div>

                <!-- Button to interact -->
                <button class="btn btn-primary btn-custom mt-4" onclick="changeMessage()">
                    Click Me 🎯
                </button>

                <!-- Input box -->
                <input type="text" id="userInput" class="form-control mt-3" placeholder="Type something...">

                <button class="btn btn-success btn-custom mt-3" onclick="showInput()">
                    Show My Text ✨
                </button>

            </div>

        </div>
    </div>
</div>

<!-- JavaScript for interaction -->
<script>
    function changeMessage() {
        document.getElementById("msg").innerHTML = "🔥 You clicked the button!";
    }

    function showInput() {
        let text = document.getElementById("userInput").value;
        document.getElementById("msg").innerHTML = "You typed: " + text;
    }
</script>

</body>
</html>