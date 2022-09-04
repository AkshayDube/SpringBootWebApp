<html>
<head>
<title>Login Page</title>
</head>
<body>
<pre>${errorMessage}</pre>
	<form action="/login" method="post">
		<input type="text" name="username" placeholder="Enter User Name"><br>
		<br> <input type="password" name="password"
			placeholder="Enter Password"><br>
		<br>
		<button type="submit">Login</button>
	</form>
</body>
</html>