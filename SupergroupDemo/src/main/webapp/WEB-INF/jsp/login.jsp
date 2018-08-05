<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Super Group</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="container" style="margin: 50px; border: 1px solid green;">
		<h3>Login Page:</h3>

		<form method="post" action="login_user">

			<c:if test="${not empty error }">
				<div class="alert alert-danger">
					<c:out value="${error }">
					</c:out>
				</div>
			</c:if>

			<div class="form-group">
				<label for="username">UserName:</label> <input type="text"
					class="form-control" id="username" name="username"
					value="${user.username}">
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					class="form-control" id="password" name="password"
					value="${user.password}">
			</div>
			<button type="submit" class="btn btn-success">Submit</button>

		</form>
	</div>

	<script src="static/js/jquery-2.2.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>

</body>
</html>