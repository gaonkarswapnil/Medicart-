<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body style="background-image: url('logo.jpg') ;   background-repeat: no-repeat;
 			 background-size: auto; background-position: center;">


 <div style="display: flex; align-items: center; justify-content: center; flex-direction: row; width: 100%; height: 500px">
 
 		
        <div style="display: flex; flex-direction:column; align-items: center; justify-content: center ;border: 1px solid #880e4f;  width: 60%; padding: 30px 5px 20px 5px">
            
            <div style="padding-bottom: 30px ; font-weight: bold; font-size: 20px">Customer Login</div>
            
            <spr:form action="login.htm" method="post" commandName="user" >
               
	               <div >username : </div>
	               <div style="color: red;" > <spr:input path="userName" /><spr:errors path="userName"></spr:errors></div>
	       		   <div style="margin: 5px" >Password : </div>
	       		   <div style="color: red;" ><spr:password path="userPass"/><spr:errors path="userPass"></spr:errors></div><br>
				   <div ><input style="border: 1px solid #880e4f; padding:5px; background-color: #880e4f; color: white; width:150px"  type="submit"  value="Login"></div>
	               <div style="margin-top: 10px; text-align: center"> <a href="prep_reg_form.htm" >Create Account</a></div>
	               <div style="margin-top: 10px; text-align: center"> <a href="index.jsp" >Back</a></div>           
            </spr:form>


        </div>

    </div>

</body>
</html>