package com.stark.service;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;


@Path("/")
@WebService(name="	",targetNamespace="http://www.starknetwork-developmet.rhcloud.com")
public interface CXFRestTest {
	@GET
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_XML,javax.ws.rs.core.MediaType.APPLICATION_JSON})
	@Path("/setResponse")
	public Response setResponse(@QueryParam("say") String statement);
}
