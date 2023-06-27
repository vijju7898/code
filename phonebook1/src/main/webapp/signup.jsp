<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ACCOUNT CREATE</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=PT+Sans');

body {
	background: #fff;
	font-family: 'PT Sans', sans-serif;
}
.h3, h3 {
    font-size: 01.2rem;
}

h2 {
	padding-top: 1.5rem;
}

a {
	color: #333;
}

a:hover {
	color: #da5767;
	text-decoration: none;
}

.card {
	border: 0.40rem solid #f8f9fa;
	top: 10%;
}

.form-control {
	background-color: #f8f9fa;
	padding: 20px;
	padding: 25px 15px;
	margin-bottom: 1.3rem;
}

.form-control:focus {
	color: #000000;
	background-color: #ffffff;
	border: 3px solid #da5767;
	outline: 0;
	box-shadow: none;
}

.btn {
	padding: 0.6rem 1.2rem;
	background: #da5767;
	border: 2px solid #da5767;
}

.btn-primary:hover {
	background-color: #df8c96;
	border-color: #df8c96;
	transition: .3s;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card">
					<h2 class="card-title text-center">
						Register Form
						<p>${msg}</p>
					</h2>
					<div class="card-body py-md-4">
						<form _lpchecked="1" action="./signupservlet" method="post">
							<div class="form-group">
								<input type="text" class="form-control" id="name"
									placeholder="Name" name="name" required="required">
							</div>
							<div class="form-group">
								<input type="email" class="form-control" id="email"
									placeholder="Email" name="email" required="required">
							</div>


							<div class="form-group">
								<input type="password" class="form-control" id="password"
									placeholder="Password" name="password" required="required">
							</div>
							<div class="form-group">
								<input type="contact" class="form-control"
									id="contact" placeholder="contact"
									name="contact" required="required">
							</div>
							
							<div class="form-group">
								<input type="password" class="form-control"
									id="confirm-password" placeholder="confirm-password"
									name="cpassword" required="required">
							</div>
							
							<div
								class="d-flex flex-row align-items-center justify-content-between">
								<h3>
								<a href="./login.jsp">LOGIN</a>
								<a href="./delete.jsp">DELETE</a>
								<a href="./update.jsp">UPDATE</a>
								</h3>
								<button class="btn btn-primary">Create Account</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>