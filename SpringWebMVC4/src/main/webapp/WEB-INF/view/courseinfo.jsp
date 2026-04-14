<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Course Info</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }

        body {
            font-family: 'Segoe UI', sans-serif;
            background: #f0f4f8;
            min-height: 100vh;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            padding: 2rem;
        }

        .card {
            background: white;
            border-radius: 16px;
            padding: 2.5rem;
            max-width: 420px;
            width: 100%;
            box-shadow: 0 8px 30px rgba(0,0,0,0.10);
            border-top: 5px solid #4f46e5;
        }

        .card h2 {
            color: #1a1a2e;
            font-size: 1.5rem;
            margin-bottom: 1.5rem;
            text-align: center;
        }

        .info-row {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 0.75rem 0;
            border-bottom: 1px solid #f0f4f8;
            font-size: 0.95rem;
        }

        .info-row:last-child { border-bottom: none; }

        .label {
            color: #888;
            font-weight: 500;
        }

        .value {
            color: #1a1a2e;
            font-weight: 600;
        }

        .price-value {
            color: #4f46e5;
            font-size: 1.1rem;
            font-weight: 700;
        }

        .btn {
            display: block;
            width: 100%;
            margin-top: 1.5rem;
            padding: 0.75rem;
            background: #4f46e5;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 1rem;
            cursor: pointer;
            text-align: center;
            text-decoration: none;
            transition: background 0.2s;
        }

        .btn:hover { background: #4338ca; }
    </style>
</head>
<body>

<div class="card">
    <h2>📘 Course Information</h2>

    <div class="info-row">
        <span class="label">Course ID</span>
        <span class="value"><c:out value="${courseId}"/></span>
    </div>

    <div class="info-row">
        <span class="label">Course Name</span>
        <span class="value"><c:out value="${courseName}"/></span>
    </div>

    <div class="info-row">
        <span class="label">Price</span>
        <span class="price-value">₹ ${coursePrice}</span>
    </div>

    <a href="/first/course-info" class="back-btn">← Back to Course Info</a>
</div>

</body>
</html>