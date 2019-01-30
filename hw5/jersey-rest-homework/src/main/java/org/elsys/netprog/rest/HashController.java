package org.elsys.netprog.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.simple.JSONObject;


@Path("/game")
public class HashController {
	
	public Hash hash = new Hash(5);
	
	@POST
	@Path("/{hash}/{input}")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getHash(@PathParam("hash") String h, @PathParam("input") String i) throws Exception{
		if(hash.checkHash(h) && hash.checkInput(i)){
			
			return Response.status(200).build();
		} else {
			
			return Response.status(406).build();
		}
	}
	
	@SuppressWarnings("unchecked")
	@GET
	@Path("/view")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response inputHash() {
		JSONObject arr = new JSONObject();
		arr.put("length", hash.getLength());
		arr.put("hash", hash.getHash());
		
		return Response.status(200).entity(arr).build();
	}
}
