package com.demo.service;

import com.demo.bean.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	private 
      LoginDao loginDao;
	
	public LoginServiceImpl() {
		super();
		loginDao=new LoginDaoImpl();
	}

	@Override
	public boolean validateUser(String uname, String pass) {
		User user=loginDao.authenticateUser(uname,pass);
	    if(user.getUname().equals(uname) && user.getPass().equals(pass)) {
	    	return true;
	    	
	    }
		return false;
	}

}
