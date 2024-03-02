<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="com.master.dto.User"%>
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
		List<User> elist = (List<User>)request.getAttribute("usersList");	
		%>
	
		<tr>
			<th>User Id</th>
			<th>User Name</th>
			<th>Mobile Number</th>
			<th>Email Id</th>
		</tr>
		<%
		for(User exp : elist){ 
		%>
		<tr class="data">
			<td>
				<%=exp.getUserId()%>
			</td>
			<td>
				<%=exp.getUserName()%>
			</td>
			<td>
				<%=exp.getMobileNumber()%>
			</td>
			
			<td>
				<%=exp.getEmailId()%>
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
			  border-radius: 5px " ><a href="AdminHome.jsp">Back</a></div></td>
			
		</tr>
	</table>

</body>
</html>