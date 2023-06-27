<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%if(session.getAttribute("login")!=null)
{
	response.sendRedirect("./dashboard.jsp");
}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user login</title>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=PT+Sans');

body{
  background: #fff;
  font-family: 'PT Sans', sans-serif;
}
h2{
  padding-top: 1.5rem;
}
a{
  color: #333;
}
a:hover{
  color: #da5767;
  text-decoration: none;
}
.card{
  border: 0.40rem solid #f8f9fa;
  top: 10%;
}
.form-control{
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

.btn{
  padding: 0.6rem 1.2rem;
  background: #da5767;
  border: 2px solid #da5767;
}
.btn-primary:hover {

    
    background-color: #df8c96;
    border-color: #df8c96;
  transition: .3s;

}
.h3, h3 {
    font-size: 01.6rem;
}
.cc{
background-color:;
}
</style>
</head>
<body class ="cc">
<div class="container">
  <div class="row justify-content-center">
  <div class="col-md-5">
   <div class="card">
     <h2 class="card-title text-center">Login Form</h2>
     <p>${msg}</p>
      <div class="card-body py-md-4">
       <form _lpchecked="1" action="./loginservlet" method="post">
        
        <div class="form-group">
             <input type="email" class="form-control" id="email" placeholder="Email" name="email" required="required">
                            </div>
                            
                          
   <div class="form-group">
     <input type="password" class="form-control" id="password" placeholder="Password" name="password" required="required">
   </div>
   
   
   <div class="d-flex flex-row align-items-center justify-content-between">
   <h3>
      <a href="./signup.jsp">SINGUP</a>
      </h3>
                                <button class="btn btn-primary">Login</button>
                                
          </div>
       </form>
     </div>
  </div>
</div>
</div>
</div>
</body>
</html>