package com.mphasis.JDBCProj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mphasis";
        
        try(Connection con=DriverManager.getConnection(url,uname,pwd);
            Statement st=con.createStatement();
//            ResultSet rs=st.executeQuery("select * from emptable");){
        		 ResultSet rs1=st.executeQuery("select * from emptable");){
//        	//inserting record
//        	String query="insert into emptable values(?,?,?,?,?,?,?,?)";
//        	PreparedStatement ps= con.prepareStatement(query);
//        	ps.setInt(1, 6771);
//        	ps.setString(2, "Rose1");
//        	ps.setString(3, "90010948799");
//        	ps.setString(4, "hyd1");
//        	ps.setInt(5, 6);
//        	ps.setInt(6, 57);
//        	ps.setInt(7, 49);
//        	ps.setString(8, "rose1@gmail1.com");
//        	
//        	ps.executeUpdate();
        	System.out.println("row inserted successfully");
        	
        	
        	//read records
//        	 ResultSetMetaData rsmd=rs.getMetaData();
//             int columnsCount=rsmd.getColumnCount();
//             while(rs.next()) {
//            	 for(int i=1;i<=columnsCount;i++)
//             		System.out.println(rsmd.getColumnName(i)+" : "+ rs.getString(rsmd.getColumnName(i)));
//             	System.out.println("-----------------------------------------------------");
//             }
             
             
            //update records
             String query="update emptable set mobile=? where employeeid=?";
             PreparedStatement ps1=con.prepareStatement(query);
             ps1.setString(1,"2468097531");
             ps1.setInt(2, 789);
             ps1.executeUpdate();
             System.out.println("row inserted successfully");
             ResultSetMetaData rsmd=rs1.getMetaData();
             int columnsCount=rsmd.getColumnCount();
             while(rs1.next()) {
            	 for(int i=1;i<=columnsCount;i++)
             		System.out.println(rsmd.getColumnName(i)+" : "+ rs1.getString(rsmd.getColumnName(i)));
             	System.out.println("-----------------------------------------------------");
             }
             
        }

	}

}
