package com.diseases.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseases.demo.model.Signup;
import com.diseases.demo.repository.SignupRep;

@Service
public class SignupService {
	@Autowired
    SignupRep signRep;
	public Signup save(Signup s) 
	{
		
		return signRep.save(s);
	}

	public String checkLogin(String uname, String password) 
	{
		Signup u = signRep.findByuname(uname);
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	

	public Signup update(Signup s) 
	{
		
		return signRep.save(s);
	}


}
