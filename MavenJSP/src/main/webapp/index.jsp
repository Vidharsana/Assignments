<%@page import="java.util.ArrayList" %>
<html>
<body>
<h2><%= "Hello World!" %></h2>


<h3>current time:<%=new java.util.Date() %></h3>


<%
	int a=5;
	int b=5;
	out.println(a+b);

%>


<%! public int add(){
	int a=56;
	int b=78;
	return a+b;
}

%>

<%out.println(add()); %>

<% ArrayList alist=new ArrayList();
alist.add(5);
alist.add("vidhu");
out.println(alist);
%>

<%@ include file="welcome.jsp" %>

<%-- <jsp:include page="welcome.jsp" /> --%>

</body>
</html>
