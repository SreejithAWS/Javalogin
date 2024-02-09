<!-- welcome.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
    <!-- You can add more content here -->
</body>
</html>
