package com.stark.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.stark.service.CXFRestTest;

public class CXFrestTestImpl implements CXFRestTest{
	@Autowired
	 private com.stark.dao.ReponseDAO rspDAO;
	@Override
	public Response setResponse(String statement) {
		if(statement == null)
		{
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		return Response.ok(rspDAO.setResponse(statement)).build();
	}

}
