<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database Connectivity</title>
</head>
<body>
<c:out value="Database connectivity"/><br>

<sql:setDataSource var="db"  
  driver="com.mysql.cj.jdbc.Driver"
  url="jdbc:mysql://localhost:3306/mphasis"
  user="root"
  password="root@39"/>

<sql:query var="rs" dataSource="${db}">
  SELECT * FROM emptable;
</sql:query><br>

<c:forEach var="row" items="${rs.rows}">
  EmployeeId : <c:out value="${row.employeeid}"/><br>
  EmployeeName : <c:out value="${row.empname}"/><br>
  Address : <c:out value="${row.address}"/><br>
  DeptId : <c:out value="${row.deptid}"/><br>
  Mobile : <c:out value="${row.mobile}"/><br>
  Age1 : <c:out value="${row.age}"/><br>
  Age2 : <c:out value="${row.agee}"/><br>
  Email : <c:out value="${row.email}"/><br>
  <br><c:out value="--------------------------------------"/><br><br>
</c:forEach>

<%-- <sql:transaction dataSource="${db}">
  <sql:update var="insert">
    INSERT INTO emptable(employeeid,empname,mobile,address,deptid,age,agee,email)
    VALUES (9999,'Aadhi',678899009,'chennai',3,55,89,'aadhi@gamil.com')
  </sql:update>
</sql:transaction> --%>


<sql:transaction dataSource="${db}">
  <sql:update var="updateResult">
    UPDATE emptable
    SET empname = 'karadiii',
        address = 'Kotagiri',
        mobile = 9876543210,
        age = 40,
        email = 'karadiii@example.com'
    WHERE employeeid = 9999;
  </sql:update>
</sql:transaction>

<c:out value="Rows affected: ${updateResult}"/>



<c:out value="${insert}"/>

</body>
</html>
