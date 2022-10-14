<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		<form:form modelAttribute="todo" method="post" action="">
			<span class="text-danger">Description:</span>
			<form:input type="hidden" path="id" /> 
			<form:input type="text" path="description" /> 
			<form:input type="hidden" path="isDone" />
			<form:input type="hidden" path="targetDate" /> 
			
			<input type="submit"
				class="btn btn-success" />
		</form:form>
	</div>
</body>
</html>