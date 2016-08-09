package com.stark.dao;


import com.stark.bean.Say;
import com.stark.restTest.RestResponse;

public class ReponseDAO {
	
	public RestResponse setResponse(String statement ){
		
		RestResponse rsp= new RestResponse();
		Say say= new Say();
		say.setStatement(statement);
		rsp.setSay(say);
		return rsp;
	}

}
