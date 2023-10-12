package com.tnsif.daynineteen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bkc", "root","");
			System.out.println("Connection established successfully...");
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * From customer");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)); 
			}
			cn.close();
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
			
		}
	}

}
