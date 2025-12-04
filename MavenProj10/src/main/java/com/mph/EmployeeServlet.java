package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
public class EmployeeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public EmployeeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        ServletContext ctx = getServletContext();
        String url = ctx.getInitParameter("url");
        String uname = ctx.getInitParameter("uname");
        String pwd = ctx.getInitParameter("pwd");

        String action = request.getParameter("action"); 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(url, uname, pwd)) {

                if ("create".equalsIgnoreCase(action)) {
                    PreparedStatement ps = conn.prepareStatement(
                        "INSERT INTO emptable(employeeid, empname, mobile, address, deptid, age, agee, email) VALUES(?,?,?,?,?,?,?,?)"
                    );
                    ps.setInt(1, Integer.parseInt(request.getParameter("employeeid")));
                    ps.setString(2, request.getParameter("empname"));
                    ps.setString(3, request.getParameter("mobile"));
                    ps.setString(4, request.getParameter("address"));
                    ps.setInt(5, Integer.parseInt(request.getParameter("deptid")));
                    ps.setInt(6, Integer.parseInt(request.getParameter("age")));
                    ps.setInt(7, Integer.parseInt(request.getParameter("agee")));
                    ps.setString(8, request.getParameter("email"));

                    int rows = ps.executeUpdate();
                    out.println("<p>Inserted " + rows + " record(s)</p>");

                } else if ("read".equalsIgnoreCase(action)) {
                    PreparedStatement ps = conn.prepareStatement("SELECT * FROM emptable");
                    ResultSet rs = ps.executeQuery();
                    out.println("<h2>Employee Records</h2>");
                    while (rs.next()) {
                        out.println(
                            rs.getInt("employeeid") + " "
                            + rs.getString("empname") + " "
                            + rs.getString("mobile") + " "
                            + rs.getString("address") + " "
                            + rs.getInt("deptid") + " "
                            + rs.getInt("age") + " "
                            + rs.getInt("agee") + " "
                            + rs.getString("email") + "<br>"
                        );
                    }

                } else if ("update".equalsIgnoreCase(action)) {
                    int employeeid = Integer.parseInt(request.getParameter("employeeid"));
                    String empname = request.getParameter("empname");
                    String mobile = request.getParameter("mobile");
                    String address = request.getParameter("address");
                    int deptid = Integer.parseInt(request.getParameter("deptid"));
                    int age = Integer.parseInt(request.getParameter("age"));
                    int agee = Integer.parseInt(request.getParameter("agee"));
                    String email = request.getParameter("email");

                    PreparedStatement ps = conn.prepareStatement(
                        "UPDATE emptable SET empname=?, mobile=?, address=?, deptid=?, age=?, agee=?, email=? WHERE employeeid=?"
                    );
                    ps.setString(1, empname);
                    ps.setString(2, mobile);
                    ps.setString(3, address);
                    ps.setInt(4, deptid);
                    ps.setInt(5, age);
                    ps.setInt(6, agee);
                    ps.setString(7, email);
                    ps.setInt(8, employeeid);

                    int rows = ps.executeUpdate();
                    out.println("<p>Updated " + rows + " record(s)</p>");

                } else if ("delete".equalsIgnoreCase(action)) {
                    int employeeid = Integer.parseInt(request.getParameter("employeeid"));
                    PreparedStatement ps = conn.prepareStatement("DELETE FROM emptable WHERE employeeid=?");
                    ps.setInt(1, employeeid);
                    int rows = ps.executeUpdate();
                    out.println("<p>Deleted " + rows + " record(s)</p>");

                } else {
                    out.println("<p>Invalid action. Use ?action=create|read|update|delete</p>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
