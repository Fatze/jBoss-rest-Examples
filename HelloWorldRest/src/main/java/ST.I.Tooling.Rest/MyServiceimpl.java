package ST.I.Tooling.Rest;

import com.wordnik.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Dostanko_VL on 08.10.2015.
 */
@Api(value = "/no prefix", description = "Simple Hi Operations")
public class MyServiceimpl implements IMyService {
    private static final Logger LOG = LoggerFactory.getLogger(MyServiceimpl.class);
    @GET
    @Path("/hi/{name}/")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "get Hi ", notes = "Simple Hi to name...", response = MyServiceHello.class)
    public MyServiceHello sayHello(@PathParam("name") final String name) {
        LOG.info("Invoking getName: {}", name);
        MyServiceHello msg = new MyServiceHello();
        msg.setName(name);
        return msg;
    }
    @GET
    @Path("/get/")
    @Produces("application/json")
    @ApiOperation(value = "get Tets", notes = "Simple Hi to test name", response = MyServiceHello.class)
    public MyServiceHello getTets() {
        LOG.info("Invoking getTets: ");
        MyServiceHello msg = new MyServiceHello();
        msg.setName("TEST");
        return msg;
    }


}
