package com.project.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {
	public boolean Check(String uname, String pass) {
		try {
			System.out.println("Inside check");
			String url="jdbc:oracle:thin:@//localhost:1521/orcl";
			String username="sys as sysdba";
			String password="system";
			String query="SELECT * FROM USER_1";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url,username,password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(2));
			}
			if(rs!=null) {
				System.out.println("yes");
				
			}
			if (rs.next()) {
				System.out.println("Inside if");
				return true;
			}
			else {
				System.out.println("Inside else");
				return false;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Error");
		return false;
	}
}
