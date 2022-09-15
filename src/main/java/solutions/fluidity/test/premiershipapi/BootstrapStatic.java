package solutions.fluidity.test.premiershipapi;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Component;
import solutions.fluidity.test.premiershipapi.model.boostrapstatic.*;
import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;
import solutions.fluidity.test.service.FixturesService;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BootstrapStatic {

    private static final Long GOAL_KEEPER = 1L;
    private static final Long DEFENDER = 2L;
    private static final Long MIDFIELDER = 3L;
    private static final Long FORWARD = 4L;
    private FixturesService fixturesService;

    public BootstrapStatic(FixturesService fixturesService) {
        this.fixturesService = fixturesService;
    }

    public String lookup() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://fantasy.premierleague.com/api/bootstrap-static/")
                .header("Accept", "application/json")
                .header("User-Agent", "Mozilla/5.0").build();
        Response response = client.newCall(request).execute();
        String responseBody = response.body().string();

        if (response.code() < 400) {
            System.out.println("yeah we got it");
            Gson gson = new GsonBuilder().create();
            BootstrapStaticModel bootstrapStaticModel = gson.fromJson(responseBody, BootstrapStaticModel.class);

            String result = fixturesService.getFixtures();
            List<FixtureModel> fixtures = fixturesService.parseResponse(result);
            var bootstrapModel = new BootstrapModel();

            List<EventModel> filteredEvents = bootstrapStaticModel.getEvents().subList(0, 1);

            getEvents(bootstrapStaticModel, filteredEvents, fixtures);
            setEventPlayerTypes(bootstrapStaticModel, filteredEvents.get(0));
            bootstrapModel.setEvents(filteredEvents);
            return gson.toJson(bootstrapModel, BootstrapModel.class);
        }
        return responseBody;
    }

    private void setEventPlayerTypes(
            BootstrapStaticModel bootstrapStaticModel,
            EventModel filteredEvents
    ) {
        bootstrapStaticModel.getElement_types().forEach(et ->
                filteredEvents.setGoalKeepers(bootstrapStaticModel.getElements().stream().filter(el -> el.getElement_type() == GOAL_KEEPER).collect(Collectors.toList())));
        filteredEvents.setForwards(bootstrapStaticModel.getElements().stream().filter(el -> el.getElement_type() == DEFENDER).collect(Collectors.toList()));
        filteredEvents.setMidfielders(bootstrapStaticModel.getElements().stream().filter(el -> el.getElement_type() == MIDFIELDER).collect(Collectors.toList()));
        filteredEvents.setDefenders(bootstrapStaticModel.getElements().stream().filter(el -> el.getElement_type() == FORWARD).collect(Collectors.toList()));
    }


    private void getEvents(BootstrapStaticModel bootstrapStaticModel,
                           List<EventModel> filteredEvents,
                           List<FixtureModel> fixtures
    ) {
        filteredEvents.stream().forEach(evt -> getEventFixtures(bootstrapStaticModel, fixtures, evt));
    }

    private void getEventFixtures(
            BootstrapStaticModel bootstrapStaticModel,
            List<FixtureModel> fixtures,
            EventModel evt
    ) {
        List<FixtureModel> eventFixtures =
                fixtures.stream().filter(fix -> fix.getEvent() == evt.getId()).collect(Collectors.toList());

        eventFixtures.stream().forEach(evtFix ->
                getTeams(bootstrapStaticModel, evtFix)
        );
        evt.setFixtures(eventFixtures);
    }

    private void getTeams(BootstrapStaticModel bootstrapStaticModel, FixtureModel evtFix) {
        List<TeamModel> homeTeam =
                bootstrapStaticModel.getTeams().stream().filter(t -> t.getId() == evtFix.getTeam_h()).collect(Collectors.toList());
        List<TeamModel> awayTeam =
                bootstrapStaticModel.getTeams().stream().filter(t -> t.getId() == evtFix.getTeam_a()).collect(Collectors.toList());

        var teams = new TeamsModel();
        teams.setHomeTeam(homeTeam.get(0));
        teams.setAwayTeam(awayTeam.get(0));

        getPlayers(bootstrapStaticModel, teams);
        evtFix.setTeams(teams);
    }

    private TeamsModel getPlayers(
            BootstrapStaticModel bootstrapStaticModel,
            TeamsModel teams
    ) {
        List<ElementModel> homeTeamPlayers =
                bootstrapStaticModel.getElements().stream().filter(elm -> elm.getTeam() == teams.getHomeTeam().getId()).collect(Collectors.toList());
        List<ElementModel> awayTeamPlayers =
                bootstrapStaticModel.getElements().stream().filter(elm -> elm.getTeam() == teams.getAwayTeam().getId()).collect(Collectors.toList());

        teams.getHomeTeam().setElements(homeTeamPlayers);
        teams.getAwayTeam().setElements(awayTeamPlayers);

        return teams;
    }
}