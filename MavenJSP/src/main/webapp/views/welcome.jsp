<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="purple">Welcome.....</h1>
	<h3>Username : <%String uname=request.getParameter("uname"); %></h3>
	<h3>password : <%String pwd=request.getParameter("pwd"); %></h3>
	<%
	if(uname.equals("vidhu") && pwd.equals("vidhu")){
		session.setAttribute("uname",uname);
	response.sendRedirect("success.jsp");
	  // response.sendRedirect("success.jsp?uname="+uname);
	}
	else
	   response.sendRedirect("error.jsp");
	%>
	
</body>
</html>