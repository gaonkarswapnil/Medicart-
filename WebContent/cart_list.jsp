<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="com.master.dto.Cart"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>


<style>
table, th, td {
  
  padding: 8px 30px 8px 30px;
  border: 1px solid #880e4f;
}

.data td{

	 background-color: #880e4f;
	 color: white;
}

a{

	text-decoration: none;
	color: white;
}

</style>


</head>
<body>

<table align="center" >
		<% 
		List<Cart> elist = (List<Cart>)request.getAttribute("cartList");	
		%>
	
		<tr>
			<th>Cart Id</th>
			<th>Medicine Name</th>
			<th>Quantity</th>
		</tr>
		<%
		for(Cart exp : elist){ 
		%>
		<tr class="data">
			<td>
				<%=exp.getCartId()%>
			</td>
			<td>
				<%=exp.getMedicineName()%>
			</td>
			<td>
				<%=exp.getQuantity()%>
			</td>
			<td>
			<a href="cart_delete.htm?cartId=<%=exp.getCartId()%>">Delete</a>
			</td>
		</tr>
		<% } %>

					
		<tr style="margin-top: 50px">
			<td style="border: none;" ><div  style="height:
			 40px; border : 1px solid black;
			  width: 100px;
			  display: flex;
			  justify-content: center;
			  align-items: center;
			  background-color:#880e4f;
			  border-radius: 5px " ><a href="prep_cart_add_form.htm">Add</a></div></td>
			<td style="border: none;" ><div  style="height:
			 40px; border : 1px solid black;
			  width: 100px;
			  display: flex;
			  justify-content: center;
			  align-items: center;
			  background-color:#880e4f;
			  border-radius: 5px " ><a href="cart_delete_all.htm">Request</a></div></td>
			
		</tr>

	</table>

</body>
</html>