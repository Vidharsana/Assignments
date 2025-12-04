<html>
<body>
<h2><%= "Hello World!" %></h2>
<h3>Create Employee</h3>
    <form action="EmployeeServlet" method="get">
        <input type="hidden" name="action" value="create"/>
        EmpID: <input type="text" name="employeeid" required/><br/><br/>
        Name: <input type="text" name="empname" required/><br/><br/>
        Mobile: <input type="text" name="mobile" required/><br/><br/>
        Address: <input type="text" name="address" required/><br/><br/>
        DeptID: <input type="text" name="deptid" required/><br/><br/>
        Age: <input type="text" name="age" required/><br/><br/>
        Agee: <input type="text" name="agee" required/><br/><br/>
        Email: <input type="text" name="email" required/><br/><br/>
        <input type="submit" value="Create"/>
    </form>
<hr>
    <!-- Read -->
    <h3>Read Employees</h3>
    <form action="EmployeeServlet" method="get">
        <input type="hidden" name="action" value="read"/>
        <input type="submit" value="Read All"/>
    </form>
<hr>
    <!-- Update -->
    <h3>Update Employee</h3>
    <form action="EmployeeServlet" method="get">
        <input type="hidden" name="action" value="update"/>
        EmpID: <input type="text" name="employeeid" required/><br/><br/>
        Name: <input type="text" name="empname"/><br/><br/>
        Mobile: <input type="text" name="mobile"/><br/><br/>
        Address: <input type="text" name="address"/><br/><br/>
        DeptID: <input type="text" name="deptid"/><br/><br/>
        Age: <input type="text" name="age"/><br/><br/>
        Agee: <input type="text" name="agee"/><br/><br/>
        Email: <input type="text" name="email"/><br/><br/>
        <input type="submit" value="Update"/>
    </form>
<hr>
    <!-- Delete -->
    <h3>Delete Employee</h3>
    <form action="EmployeeServlet" method="get">
        <input type="hidden" name="action" value="delete"/>
        EmpID: <input type="text" name="employeeid" required/><br/><br/>
        <input type="submit" value="Delete"/>
    </form>
</body>
</html>
