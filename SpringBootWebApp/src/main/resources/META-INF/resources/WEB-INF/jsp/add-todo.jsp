<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Welcome</title>
<link rel="stylesheet"
	href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<h1 class="">Add New Todo Task</h1>
		<hr>
		<form action="/todos" method="post">
			<span class="text-danger">Description:</span>
			<input type="text" name="description"> <input type="submit"
				class="btn btn-success">
		</form>
	</div>
</body>
</html>