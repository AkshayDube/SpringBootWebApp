<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Welcome</title>
</head>
<body>
	<h1>Welcome to your Todos ${username}</h1><hr>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.isDone}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>