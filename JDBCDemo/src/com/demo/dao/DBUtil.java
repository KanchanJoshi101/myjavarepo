package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	public static Connection getMyConnection() {
		System.out.println("In get my connection");
		if(conn==null) {
			String url = "jdbc:derby:d:\\mydata\\hsbcdb1";
	        String user = "hsbc";
	        String password = "hsbc123";
	        try {
				conn = DriverManager.getConnection(url, user, password);
				if (conn != null) {
		            System.out.println("Connected to database ");
		        }
			} catch (SQLException e) {
				System.out.println("Connection not done ");
				e.printStackTrace();
			}
			
		}
		return conn;
	}
	
	public static void closeMyConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
