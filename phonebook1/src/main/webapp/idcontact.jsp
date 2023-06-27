<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact search</title>

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
</style>
</head>
<body>
<div class="container">
  <div class="row justify-content-center">
  <div class="col-md-5">
   <div class="card">
     <h2 class="card-title text-center">SEARCH CONTACT
     <p>${msg}</p>
     </h2>
      <div class="card-body py-md-4">
       <form _lpchecked="1" action="./idcontact" method="post">
          
        <div class="form-group">
             <input type="text" class="form-control" id="name" placeholder="name" name="name" required="required">
                            </div>
                            
                          
   
   
   <div class="d-flex flex-row align-items-center justify-content-between">
									<a href="./dashboard.jsp">DASHBOARD</a>			
                                <button ><a href="./idcontact?uid=${login}">SEARCH</a></button>
          </div>
          
       </form>
     </div>
  </div>
</div>
</div>
</div>
 <div class="report-container">
                <div class="report-header">
                
                    <h1 class="recent-Articles"></h1>
                    <button class="text">
                    <h3>
                    <a href="./idcontact?uid=${login}"></a>
                    </h3>
                    </button>
                </div>
 
                <div class="container">
		<form action="./idcontact" method="post">
		<table class=" table">
				<tr class="thead-dark">
					<th scope="col">id</th>
					<th scope="col">uId</th>
					<th scope="col">name</th>
					<th scope="col">email</th>
					<th scope="col">contact</th>
					
				</tr>

			<c:forEach items="${list}" var="contact">
				<tr>
					<td>${contact.id}</td>
					<td>${contact.uId}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.mobile}</td>
					<td> 
                    <a href="./updatecontact.jsp">edit</a>/<a href="./deletecontact.jsp">delete</a>
				</tr>
				<td> 
                    
                    
                    </tr>
			</c:forEach>
			
		</table>
		</form>
	</div>
	</div>
</body>
</html>