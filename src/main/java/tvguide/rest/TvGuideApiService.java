package tvguide.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Miguel Reyes
 */
@Path("/json/{name}")
@Stateless
public class TvGuideApiService {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getHelloWorldJSON(@PathParam("name") String name) {
        System.out.println("name: " + name);
        return "{\"result\":\"" + "Hello " + name + "\"}";
    }

}
