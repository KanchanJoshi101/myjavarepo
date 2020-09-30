package com.demo.dao;

import com.demo.bean.User;

public interface LoginDao {

	User authenticateUser(String uname, String pass);

}
