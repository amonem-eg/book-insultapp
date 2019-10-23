package org.openshift;
import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@RequestScoped
@Path("/msg")
public class InsultResource {

@GET()
@Produces("application/json")
public HashMap<String,String> getInsult() {

	HashMap<String, String> theMsg = new HashMap<String, String>();
	theMsg.put("msg", new InsultGenerator().generateInsult());
	return theMsg;

	}
}