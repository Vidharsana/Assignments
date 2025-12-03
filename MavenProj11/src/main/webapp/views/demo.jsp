<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="vidhu"/>
<c:out value="${name}"/>
<c:if test="${name == 'vidhu'}"><h1>Name is Vidhu</h1> </c:if>
</body>
</html>