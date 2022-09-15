package solutions.fluidity.test;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.service.BootstrapService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Component
@Path("bootstrap")
public class BootstrapResource {

    private BootstrapService bootstrapService;

    public BootstrapResource(BootstrapService bootstrapService) {
        this.bootstrapService = bootstrapService;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBootstrapStatic() throws IOException {
        String result = bootstrapService.getBootstrapData();
        return Response.ok(result).build();
    }
}