
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Super Group</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">	
</head>
<body>
<form>
	<div class="container" style="margin: 50px; border: 1px solid green;" >
	
	<div role="navigation">
		<div class="navbar navbar-inverse">
			
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/addMovie">Add Movies</a></li>
					<li><a href="/listmovies">List Movies</a></li>
				</ul>
			</div>
		</div>
	</div>
	
		<c:if test="${not empty success }">
				<div class="alert alert-danger">
					<c:out value="${success}">
					</c:out>
				</div>
			</c:if>
	
	
		<div class="form-group " align="center">
			<h1>Welcome to Super Group</h1>
			
			<h3>Super Group is a leading transport logistics and mobility group providing end-to-end supply chain solutions, 
			fleet management and dealership services to a diversified global customer base. 
			Super Group comprises supply chain and mobility businesses focused on offering a comprehensive range of services, 
			utilising world-class skills and technology.</h3>

		</div>
	</div>
</form>
 <script src="static/js/jquery-2.2.1.min.js"></script>
 <script src="static/js/bootstrap.min.js"></script>

</body>
</html>