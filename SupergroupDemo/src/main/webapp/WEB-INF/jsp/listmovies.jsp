<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Super Group</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container" style="margin: 50px; border: 1px solid green;">
				<h3>All Movies for hire</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Movie Name</th>
								<th>Movie Type</th>
								<th>Description</th>
								<th>Delete</th>
								<th>Edit</th>
							</tr>
						</thead>
					
						<tbody>
							<c:forEach var="movie" items="${movies}">
								<tr>
									<td>${movie.id}</td>
									<td>${movie.moviename}</td>
									<td>${movie.movietype}</td>
									<td>${movie.moviedescription}</td>
									<td><a href="/delete-movie?id=${movie.id}">delete</a></td>
									<td><a href="/edit-movie?id=${movie.id}">edit</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
 <script src="static/js/jquery-2.2.1.min.js"></script>
 <script src="static/js/bootstrap.min.js"></script>
</body>
</html>