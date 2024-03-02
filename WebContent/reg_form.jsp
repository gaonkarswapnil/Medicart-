<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	
	 <div style="display: flex; align-items: center; justify-content: center; flex-direction: row; width: 100%; height: 500px">
 
 		
        <div style="display: flex; flex-direction:column; align-items: center; justify-content: center ;border: 1px solid #880e4f;  width: 60%; padding: 30px 5px 20px 5px">
            
            <div style="padding-bottom: 30px ; font-weight: bold; font-size: 20px">Sign-Up Form</div>
            
            <spr:form action="reg.htm" method="post" commandName="user" >
               
	               <div style="margin: 5px" >username : </div>
	               <div style="color: red;" > <spr:input path="userName" /><spr:errors path="userName"></spr:errors></div>
	               
	       		   <div style="margin: 5px" >Password : </div>
	       		   <div style="color: red;" ><spr:password path="userPass"/><spr:errors path="userPass"></spr:errors></div><br>
	       		   
	       		    <div style="margin: 5px" >Mobile Number : </div>
	       		   <div style="color: red;" ><spr:input path="mobileNumber"/><spr:errors path="mobileNumber"></spr:errors></div><br>
	       		   
	       		    <div style="margin: 5px" >Email Id : </div>
	       		   <div style="color: red;" ><spr:input path="emailId"/><spr:errors path="emailId"></spr:errors></div><br>
	       		   
	       		   
				   <div ><input style="border: 1px solid #880e4f; padding:5px; background-color: #880e4f; color: white; width:150px"  type="submit"  value="Register"></div>
	               <div style="margin-top: 10px; text-align: center"> <a href="index.jsp" >Back</a></div>        
           
            </spr:form>


        </div>

    </div>
	
	
</body>
</html>