package com.mphasis.JDBCProj1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mphasis";
        
        try(Connection con=DriverManager.getConnection(url,uname,pwd);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from student");){
        ResultSetMetaData rsmd=rs.getMetaData();
        int columnsCount=rsmd.getColumnCount();
        
        for(int i=1;i<=columnsCount;i++)
        	System.out.println(rsmd.getColumnName(i)+" : "+rsmd.getColumnClassName(i));
        System.out.println("-----------------------------------------------------");
        while(rs.next()) {
//        	System.out.println("Student ID : "+rs.getInt(1));
//        	System.out.println("Course ID : "+rs.getInt(2));
//        	System.out.println("Student Name : "+rs.getString(3));
//        	System.out.println("Course Name : "+rs.getString(4));
//        	System.out.println("Marks : "+rs.getDouble(5));
        	for(int i=1;i<=columnsCount;i++)
        		System.out.println(rsmd.getColumnName(i)+" : "+ rs.getString(rsmd.getColumnName(i)));
        	System.out.println("-----------------------------------------------------");
        }
        
        DatabaseMetaData dbmd=con.getMetaData();
        System.out.println(dbmd.getDatabaseProductName());
        ResultSet rs1=dbmd.getTables(null, null, "%", new String[] {"TABLE"});
        while(rs1.next()) {
        	System.out.println(rs1.getString("TABLE_NAME"));
        }
      }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
    }
}
