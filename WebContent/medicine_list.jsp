<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
<%@page import="com.master.dto.Medicine"%>
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
		List<Medicine> elist = (List<Medicine>)request.getAttribute("medicineList");	
		%>
	
		<tr>
			<th>Name</th>
			<th>Mfg Date</th>
			<th>Exp Date</th>
			<th>Price per Unit</th>
			<th>Rack Number</th>		
		</tr>
		<%
		for(Medicine exp : elist){ 
		%>
		<tr class="data">
			<td>
				<%=exp.getMedicineName()%>
			</td>
			<td>
				<%=exp.getMfgDate()%>
			</td>
			<td>
				<%=exp.getExpDate()%>
			</td>
			<td>
				<%=exp.getPrice()%>
			</td>
			<td>
				<%=exp.getRackNumber()%>
			</td>
			<td>
				<a href="medicine_delete.htm?medicineId=<%=exp.getMedicineId()%>">Delete</a>
			</td>
			<td>
				<a href="medicine_update_form.htm?medicineId=<%=exp.getMedicineId()%>">Update</a>
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