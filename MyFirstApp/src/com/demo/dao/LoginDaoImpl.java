package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.User;

public class LoginDaoImpl implements LoginDao{
	static Connection conn;
	static PreparedStatement pgetbyname;
	static {
		conn=DBUtil.getMyConnection();
		try {
			pgetbyname=conn.prepareStatement("select * from user1 where uname=? and pass=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public User authenticateUser(String uname, String pass) {
		try {
			pgetbyname.setString(1, uname);
			pgetbyname.setString(2, pass);
			ResultSet rs=pgetbyname.executeQuery();
			if(rs.next()) {
				User u=new User(rs.getString(1),rs.getString(2),rs.getString(3));
				return u;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
