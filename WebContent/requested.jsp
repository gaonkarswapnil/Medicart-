<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Welcome User</title>

<style>

.mainbox{

	display: flex;
	justify-content: center;
	align-items: center;
	height: 500px;
	width: 100%;
}

.submainBox{

	display: flex;
	justify-content: center;
	flex-direction:column;
	align-items: center;
	width: 800px;
}

.subbox{
	
	display: flex;
	justify-content: center;
	align-items: center;
	border: 1px solid #880e4f;	
	width:100%;
	height: 50px;
	margin: 5px
}

a{
	text-decoration: none;
	color: #880e4f;	
	
}

</style>

</head>

<body>

<div class="mainbox">
	<span>&nbsp;&nbsp;</span>
	<div class="submainBox">
		<div class="subbox">Request Accepted</div>
		<div style="background-color: #880e4f" class="subbox"><a style="color: white" href="UserHome.jsp">Back</a></div>
	</div>
</div>

</body>
</html>