package nehsa.webproj.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import nehsa.webproj.domain.Employee;

@Path("/testRest")
public class RestTest {

	@GET
	@Path("/testString")
	@Produces(MediaType.TEXT_PLAIN)
	public String plainString(){
		return "hello plain string update1";
	}
	
	//@Path("/testJson/{id}")
		//@Produces(MediaType.APPLICATION_JSON)
	//public Employee getJSON(@PathParam("id") Integer id){
	
	
	@GET
	@Path("/testJson/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getJSON(@PathParam("id") Integer id){	
		Employee employee = new Employee();
		employee.setName("John");
		employee.setAge(20);
		employee.setId(id);
		
		return employee;
		//return "{\"name\": \"john\", \"age\": 20}";
	}
	
}
