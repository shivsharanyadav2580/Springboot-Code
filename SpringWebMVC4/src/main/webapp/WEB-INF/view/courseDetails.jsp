<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Course Details</title>
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
            max-width: 450px;
            width: 100%;
            box-shadow: 0 8px 30px rgba(0,0,0,0.10);
            border-top: 5px solid #059669;
        }

        .card-header {
            text-align: center;
            margin-bottom: 2rem;
        }

        .card-header .icon {
            font-size: 3rem;
            margin-bottom: 0.5rem;
        }

        .card-header h2 {
            color: #1a1a2e;
            font-size: 1.5rem;
        }

        .detail-block {
            background: #f8fafc;
            border-radius: 10px;
            padding: 1rem 1.25rem;
            margin-bottom: 1rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .detail-block .label {
            color: #888;
            font-size: 0.85rem;
            font-weight: 500;
            text-transform: uppercase;
            letter-spacing: 0.5px;
        }

        .detail-block .value {
            color: #1a1a2e;
            font-size: 1rem;
            font-weight: 700;
        }

        .price-tag {
            background: #ecfdf5;
            border-radius: 10px;
            padding: 1rem 1.25rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
            border: 1px dashed #059669;
        }

        .price-tag .label {
            color: #059669;
            font-weight: 600;
            font-size: 0.9rem;
        }

        .price-tag .value {
            color: #059669;
            font-size: 1.3rem;
            font-weight: 800;
        }

        .back-btn {
            display: block;
            width: 100%;
            margin-top: 1.5rem;
            padding: 0.75rem;
            background: #1a1a2e;
            color: white;
            border-radius: 8px;
            text-align: center;
            text-decoration: none;
            font-size: 0.95rem;
            transition: background 0.2s;
        }

        .back-btn:hover { background: #2d2d4e; }
    </style>
</head>
<body>

<div class="card">
    <div class="card-header">
        <div class="icon">🎓</div>
        <h2>${course.name}</h2>
    </div>

    <div class="detail-block">
        <span class="label">Course ID</span>
        <span class="value"># ${course.id}</span>
    </div>

    <div class="detail-block">
        <span class="label">Course Name</span>
        <span class="value">${course.name}</span>
    </div>

    <div class="price-tag">
        <span class="label">💰 Price</span>
        <span class="value">₹ ${course.price}</span>
    </div>

    <a href="/first/course-info" class="back-btn">← Back to Course Info</a>
</div>

</body>
</html>