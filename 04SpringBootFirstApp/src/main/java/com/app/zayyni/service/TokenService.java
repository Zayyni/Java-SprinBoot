package com.app.zayyni.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TokenService {
	@Autowired
	private Token token;
	
	public Token getToken() {
		token = getNewTokenObj();
		return token;
	}

	@Override
	public String toString() {
		return "TokenService [token=" + token + "]";
	}
	
	@Lookup
	public Token getNewTokenObj(){
		// container provides
		return null;
	};

	

	

}
