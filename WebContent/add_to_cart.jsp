<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image: url('logo.jpg') ;   background-repeat: no-repeat;
 			 background-size: auto; background-position: center;">

 <div style="display: flex; align-items: center; justify-content: center; flex-direction: row; width: 100%; height: 500px">
 
 		
        <div style="display: flex; flex-direction:column; align-items: center; justify-content: center ;border: 1px solid #880e4f;  width: 30%; padding: 30px 5px 20px 5px">
            
            <div style="padding-bottom: 30px ; font-weight: bold; font-size: 20px">Add Medicine</div>
            
            <spr:form action="cart_add.htm" method="post" commandName="cart" >
               
               	  <span>Name of Medicine</span>	
               	  <div style="margin-bottom: 10px"><spr:input path="medicineName"/></div>
               	  <span>Quantity</span>
	              <div style="margin-bottom: 10px"><spr:input path="quantity"/></div>
				   <div ><input style="border: 1px solid #880e4f;
				    padding:5px; background-color: #880e4f; margin-top:20px; width:150px;
				     color: white"  type="submit"  value="Add"></div>
	               <div style="margin-top: 10px; text-align: center; "> <a href="UserHome.jsp" >Back</a></div>  
	               <div style="margin-top: 10px; text-align: center; "> <a href="prep_cart_list.htm" >Show Cart</a></div>
	                       
            </spr:form>


        </div>
 </div>   
	

</body>
</html>