<html>
<head>
<title>Login Page</title>
<link rel="stylesheet"
	href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	<h1 class="text-center">Login</h1>
		<pre class="text-danger">${errorMessage}</pre>
		<form action="/login" method="post">
			<input type="text" name="username" placeholder="Enter User Name"><br>
			<br> <input type="password" name="password"
				placeholder="Enter Password"><br> <br>
			<button type="submit">Submit</button>
		</form>
	</div>
</body>
</html>