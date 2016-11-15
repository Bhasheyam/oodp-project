package LF2UService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import Service.Deliverystatus;
@Path("/delivery")
public class Delivery {
	Deliversupport use=new Deliverystatus();
boolean a;

@GET
public Response send()
{
	String s="hello";
	return Response.status(200).entity(s).build();	
}
	@Path("/{oid}")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response Deliverysta(@PathParam("oid")String s,@Context UriInfo i)
	{ 
		System.out.println("hello");
		
			a=use.Delivery(s);
		if(a==false)	
		{
			 return Response.status(Response.Status.NOT_FOUND).entity("Order not found for ID: " + s).build();
		}
		else
		{
		UriBuilder builder = i.getAbsolutePathBuilder();
	       builder.path(s);
		return Response.created(builder.build()).build();
		}
		
		}
}
