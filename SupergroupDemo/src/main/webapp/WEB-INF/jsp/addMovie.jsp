
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<link href="static/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
	<div class="container" style="margin: 50px; border: 1px solid green;">
		<h3>Add New Movies:</h3>

		<form  method="post" action="savemovie">
		
		
			<input type="hidden" name="id" value="${movie.id}"/>
			<div class="form-group">
				<label for="moviename">Movie Name:</label> <input type="text"
					class="form-control" id="name" name="moviename" value="${movie.moviename}">
			</div>
			<div class="form-group">
				<label for="movietype">Movie Type:</label> <input type="movieType"
					class="form-control" id="type" name="movietype" value="${movie.movietype}">
			</div>
			<div class="form-group">
				<label for="moviedescription">Movie Description:</label> <input type="movieDesc"
					class="form-control" id="desc" name="moviedescription" value="${movie.moviedescription}">
			</div>
			<button type="submit" class="btn btn-success">Add</button>

		</form>
	</div>

	<script src="static/js/jquery-2.2.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>

</body>

</html>


	