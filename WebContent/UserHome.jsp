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

<body style="background-image: url('logo.jpg') ;   background-repeat: no-repeat;
 			 background-size: auto; background-position: center;">

<div><a href="log_out.htm">Log Out</a></div>

<div class="mainbox">
	<span>&nbsp;&nbsp;</span>
	<div class="submainBox">
		<div class="subbox"><a href="prep_cart_add_form.htm">Add medicine to Buy</a></div>
		<div style="background-color: #880e4f" class="subbox"><a style="color: white" href="prep_cart_list.htm">List Of Added Medicine</a></div>
	</div>
</div>

</body>
</html>