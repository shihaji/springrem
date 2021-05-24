package com.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;

	public boolean validateUser(String name, String pass) {

		String s = loginDao.validateUser(name, pass);

		if (s.equals(pass)) {

			return true;
		} else {
			return false;
		}
	}
	
	
	
	

}
