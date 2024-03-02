

<%

	String username = request.getParameter("username");
	String password = request.getParameter("pass");

	System.out.println(username);
	System.out.println(password);
	
	if("admin".equals(username) && "admin".equals(password)){

		response.sendRedirect("AdminHome.jsp");
	}

	else{
		
		response.sendRedirect("admin_login.jsp");
	}
	
	


%>