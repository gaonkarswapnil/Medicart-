<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body style="background-image: url('logo.jpg') ;   background-repeat: no-repeat;
 			 background-size: auto; background-position: center;">


 <div style="display: flex; align-items: center; justify-content: center; flex-direction: row; width: 100%; height: 500px">
 
 		
        <div style="display: flex; flex-direction:column; align-items: center; justify-content: center ;border: 1px solid #880e4f;  width: 30%; padding: 30px 5px 20px 5px">
            
            <div style="padding-bottom: 30px ; font-weight: bold; font-size: 20px">Medical Login</div>
            
            <form action="admin.jsp">
               
	               <div >username : </div>
	               <div > <input path="userName" name="username" /></div>
	       		   <div style="margin: 5px" >Password : </div>
	       		   <div ><input type="password" name="pass" path="userPass"/></div><br>
				   <div ><input style="border: 1px solid #880e4f; padding:5px; background-color: #880e4f; color: white ; width: 150px"  type="submit"  value="Login"></div>
	               <div style="margin-top: 10px; text-align: center"> <a href="index.jsp" >Back</a></div>        
            </form>


        </div>

    </div>

</body>
</html>