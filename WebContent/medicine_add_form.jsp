<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicine Form</title>


</head>
<body style="background-image: url('logo.jpg') ;   background-repeat: no-repeat;
 			 background-size: auto; background-position: center;">	
	 <div style="display: flex; align-items: center; justify-content: center; flex-direction: row; width: 100%; height: 500px">
 
 		
        <div style="display: flex; flex-direction:column; align-items: center; justify-content: center ;border: 1px solid #880e4f;  width: 30%; padding: 30px 5px 20px 5px">
            
            <div style="padding-bottom: 30px ; font-weight: bold; font-size: 20px">Add Medicine</div>
            
            <spr:form action="medicine_add.htm" method="post" commandName="medicine" >
               
               	  <span">Name of Medicine</span>	
               	  <div style="margin-bottom: 10px"><spr:input path="medicineName"/></div>
               	  <span>Mfg Date</span>
	              <div style="margin-bottom: 10px"><spr:input path="mfgDate"/></div>
	              <span>Exp Date</span>
	              <div style="margin-bottom: 10px"><spr:input path="expDate"/></div>
	              <span >Price Per Unit</span>
	              <div style="margin-bottom: 10px"><spr:input path="price"/></div>
	              <span>Rack Number</span>
	               <div style="margin-bottom: 10px"><spr:input path="rackNumber"/></div>
				   <div ><input style="border: 1px solid #880e4f; padding:5px; background-color: #880e4f; margin-top:20px; width:150px; color: white"  type="submit"  value="Add"></div>
	               <div style="margin-top: 10px; text-align: center; "> <a href="AdminHome.jsp" >Back</a></div>        
            </spr:form>


        </div>
	
	
	
</body>
</html>