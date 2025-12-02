<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h5 style="color:red">Invalid Credentials</h5> -->


<%-- <%Exception ex=(Exception)request.getAttribute(err); %> --%>
<%-- <%= ex.getMessage() %> --%>
<%-- <%= exception.getMessage() %> --%>


<%out.println("Excepion is "+Exception.getMessage()); %>
</body>
</html>