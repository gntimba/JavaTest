package solutions.fluidity.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import solutions.fluidity.test.service.GameService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Component
@Path("games")
public class GamesResource {

    @Autowired
    GameService gameService;

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response games() throws IOException {
        return Response.ok(gameService.getMatches()).build();
    }


}
