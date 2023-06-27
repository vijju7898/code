<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%if(session.getAttribute("login")==null )
    {
    	response.sendRedirect("./login.jsp");
    }
    %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="en">
 
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible"
          content="IE=edge">
    <meta name="viewport"
          content="width=device-width,
                   initial-scale=1.0">
    <title>contact dashboard</title>
    <link rel="stylesheet"
          href="style.css">
    <link rel="stylesheet"
          href="responsive.css">
          <link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
</head>
<title>ACCOUNT CREATE</title>
<style type="text/css">
@import url(
"https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap");
 
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
:root {
  --background-color1: #fafaff;
  --background-color2: #ffffff;
  --background-color3: #ededed;
  --background-color4: #cad7fda4;
  --primary-color: #4b49ac;
  --secondary-color: #0c007d;
  --Border-color: #3f0097;
  --one-use-color: #3f0097;
  --two-use-color: #5500cb;
}
body {
  background-color: var(--background-color4);
  max-width: 100%;
  overflow-x: hidden;
}
 
header {
  height: 70px;
  width: 100vw;
  padding: 0 30px;
  background-color: var(--background-color1);
  position: fixed;
  z-index: 100;
  box-shadow: 1px 1px 15px rgba(161, 182, 253, 0.825);
  display: flex;
  justify-content: space-between;
  align-items: center;
}
 
.logo {
  font-size: 27px;
  font-weight: 600;
  color: rgb(47, 141, 70);
}
 
.icn {
  height: 30px;
}
.menuicn {
  cursor: pointer;
}
body {
    margin: 0;
    font-family: -apple-system,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif,"Apple Color Emoji","Segoe UI Emoji","Segoe UI Symbol","Noto Color Emoji";
    font-size: 1rem;
    font-weight: unset;
    line-height: 0.5;
    color: #212529;
    text-align: center;
    background-color: #fff;
}
 
.searchbar,
.message,
.logosec {
  display: flex;
  align-items: center;
  justify-content: center;
}
 
.searchbar2 {
  display: none;
}
 
.logosec {
  gap: 60px;
}
 
.searchbar input {
  width: 250px;
  height: 42px;
  border-radius: 50px 0 0 50px;
  background-color: var(--background-color3);
  padding: 0 20px;
  font-size: 15px;
  outline: none;
  border: none;
}
.searchbtn {
  width: 50px;
  height: 42px;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: 0px 50px 50px 0px;
  background-color: var(--secondary-color);
  cursor: pointer;
}
 
.message {
  gap: 40px;
  position: relative;
  cursor: pointer;
}
.circle {
  height: 7px;
  width: 7px;
  position: absolute;
  background-color: #fa7bb4;
  border-radius: 50%;
  left: 19px;
  top: 8px;
}
.dp {
  height: 40px;
  width: 40px;
  background-color: #626262;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  overflow: hidden;
}
.main-container {
  display: flex;
  width: 100vw;
  position: relative;
  top: 70px;
  z-index: 1;
}
.dpicn {
  height: 42px;
}
 
.main {
  height: calc(100vh - 70px);
  width: 100%;
  overflow-y: scroll;
  overflow-x: hidden;
  padding: 40px 30px 30px 30px;
}
 
.main::-webkit-scrollbar-thumb {
  background-image:
        linear-gradient(to bottom, rgb(0, 0, 85), rgb(0, 0, 50));
}
.main::-webkit-scrollbar {
  width: 5px;
}
.main::-webkit-scrollbar-track {
  background-color: #9e9e9eb2;
}
 
.box-container {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  flex-wrap: wrap;
  gap: 50px;
}
.nav {
  min-height: 91vh;
  width: 250px;
  background-color: var(--background-color2);
  position: absolute;
  top: 0px;
  left: 00;
  box-shadow: 1px 1px 10px rgba(198, 189, 248, 0.825);
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  overflow: hidden;
  padding: 30px 0 20px 10px;
}
.navcontainer {
  height: calc(100vh - 70px);
  width: 250px;
  position: relative;
  overflow-y: scroll;
  overflow-x: hidden;
  transition: all 0.5s ease-in-out;
}
.navcontainer::-webkit-scrollbar {
  display: none;
}
.navclose {
  width: 80px;
}
.nav-option {
  width: 250px;
  height: 60px;
  display: flex;
  align-items: center;
  padding: 0 30px 0 20px;
  color:black;
  gap: 20px;
  transition: all 0.1s ease-in-out;
}
.nav-option:hover {
  border-left: 5px solid #a2a2a2;
  background-color: #dadada;
  cursor: pointer;
}
.nav-img {
  height: 30px;
}
.h3, h3 {
    font-size: 01.1rem;
}
 
.nav-upper-options {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 30px;
}
 
.option1 {
  border-left: 5px solid #010058af;
  background-color: var(--Border-color);
  color: white;
  cursor: pointer;
}
.option1:hover {
  border-left: 5px solid #010058af;
  background-color: var(--Border-color);
}
a {
    color: #1d2124;
    text-decoration: none;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}
.box {
  height: 130px;
  width: 230px;
  border-radius: 20px;
  box-shadow: 3px 3px 10px rgba(0, 30, 87, 0.751);
  padding: 20px;
  display: flex;
  align-items: center;
  justify-content: space-around;
  cursor: pointer;
  transition: transform 0.3s ease-in-out;
}
.box:hover {
  transform: scale(1.08);
}
 

 
.box img {
  height: 50px;
}
.box .text {
  color: white;
}
.topic {
  font-size: 13px;
  font-weight: 400;
  letter-spacing: 1px;
}
 
.topic-heading {
  font-size: 30px;
  letter-spacing: 3px;
}
 
.report-container {
  min-height: 300px;
  max-width: 1200px;
  margin: 70px auto 0px auto;
  background-color: #ffffff;
  border-radius: 30px;
  box-shadow: 3px 3px 10px rgb(188, 188, 188);
  padding: 0px 20px 20px 20px;
}
.report-header {
    height: 80px;
    width: 100%;
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 20px 20px 10px 20px;
    border-bottom: 2px solid #e9ecef;

}
 
.recent-Articles {
  font-size: 30px;
  font-weight: 600;
  color: #5500cb;
}
.btn {
	padding: 0.6rem 1.2rem;
	background: #da5767;
	border: 1px solid #da5767;
}

.btn-primary:hover {
	background-color: #df8c96;
	border-color: #df8c96;
	transition: .3s;
}
.h1, .h2, .h3, .h4, .h5, .h6, h1, h2, h3, h4, h5, h6 {
    /* margin-bottom: .5rem; */
    font-family: inherit;
    font-weight: 800;
    line-height: 1.2;
    color: inherit;
}
 
.view {
  height: 35px;
  width: 90px;
  border-radius: 8px;
  background-color: #5500cb;
  color: white;
  font-size: 15px;
  border: none;
  cursor: pointer;
}
 
.report-body {
  max-width: 1160px;
  overflow-x: auto;
  padding: 20px;
}
.report-topic-heading,
.item1 {
  width: 1120px;
  display: flex;
  justify-content: space-between;
  align-items: center;
}
.t-op {
  font-size: 18px;
  letter-spacing: 0px;
}
 
.items {
  width: 1120px;
  margin-top: 15px;
}
 
.item1 {
  margin-top: 20px;
}
.t-op-nextlvl {
  font-size: 14px;
  letter-spacing: 0px;
  font-weight: 600;
}
 
.lavel-tag {
  width: 100px;
  text-align: center;
  background-color: rgb(0, 177, 0);
  color: white;
  border-radius: 4px;
}


.mp{
background-color: black;
}
.box {
    height: 130px;
    width: 230px;
    border-radius: 20px;
    box-shadow: 3px 3px 30px #e9ecef;
    padding: 20px;
    display: flex;
    align-items: center;
    justify-content: space-around;
    cursor: pointer;
    transition: transform 0.3s ease-in-out;
}
a1 {
    color:cornsilk;
    text-decoration: none;
    background-color: transparent;
    -webkit-text-decoration-skip: objects;
}

</style>

 
<body class="mp">
   
    <!-- for header part -->
    <header>
 
        <div class="logosec">
            <div class="logo">PHONEBOOK</div>
           

        </div>
 
        <div class="searchbar">
            <input type="text"
                   placeholder="Search">
            <div class="searchbtn">
           
              <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210180758/Untitled-design-(28).png"
                    class="icn srchicn"
                    alt="search-icon">
              </div>
        </div>
 
          

            <div class="dp">
              <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210180014/profile-removebg-preview.png"
                    class="dpicn"
                    alt="dp">
              </div>
        </div>
 
    </header>
 <form _lpchecked="1" action="./signupservlet" method="post">
    <div class="main-container">
        <div class="navcontainer">
            <nav class="nav">
                <div class="nav-upper-options">
                    <div class="nav-option option1">
                        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210182148/Untitled-design-(29).png"
                            class="nav-img"
                            alt="dashboard">
                        <h3> DASHBOARD</h3>
                    </div>
 
                    <div class="option2 nav-option">
                        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/9.png"
                            class="nav-img"
                            alt="articles">
                        <h3> ARTICAL</h3>
                    </div>
 
 
                    
 
                    <div class="nav-option option5">
                        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210183323/10.png"
                            class="nav-img"
                            alt="blog">
                        <h3> PROFILE</h3>
                    </div>
 
 
                       
                   
 					
                    
                    <div class="nav-option logout">
                        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/7.png"
                            class="nav-img">
                            <h3>
                            <a href="./delete.jsp">USER DELETE</a>
                       </h3>
                    </div>
                    <div class="nav-option logout">
                        <img src=
"https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/7.png"
                            class="nav-img">
                            <h3>
                            <a href="./logoutservlet" onclick=" return confirm('are you sure you want to delete')">LOGOUT</a>
                            </h3>
                             </div>
                </div>
            </nav>
        </div>
        </form>
        <div class="main">
 
           
 
         
 
            <div class="report-container">
                <div class="report-header">
                
                   
                    <button class="text">
                    <h3>
                   <a href="./addcontact.jsp">ADD CONTACT</a>
                    
                    </h3>
                    </button>
                     <button class="text">
                       <h3>
                       <a href="./viewcontactservlet?uid=${login}">view</a>
                        </h3>
                </button>
                </div>
 
                <div class="container">
		<form action="./viewcontactservlet" method="post">
		<table class=" table">
				<tr class="thead-dark">
					<th scope="col">id</th>
					<th scope="col">uId</th>
					<th scope="col">name</th>
					<th scope="col">email</th>
					<th scope="col">contact</th>
					<th scope="col">action</th>
					
				</tr>

			<c:forEach items="${list}" var="contact">
				<tr>
					<td>${contact.id}</td>
					<td>${contact.uId}</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.mobile}</td>
                    <td><a href="getservlet?method=post&id=${contact.id }">edit</a>/<a href="delete?method=post&id=${contact.id }"onclick=" return confirm('are you sure you want to delete')">delete</a></td>
					 
				</tr>
				<td> 
                    
                    
                    </tr>
			</c:forEach>
			
		</table>
		</form>
	</div>
                    
 
                    </div>
                </div>
            </div>
        </div>
    </div>
 
    <script src="./index.js"></script>
</body>
</html>