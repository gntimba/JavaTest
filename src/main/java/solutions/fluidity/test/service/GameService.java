package solutions.fluidity.test.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solutions.fluidity.test.premiershipapi.model.boostrapstatic.BootstrapStaticModel;
import solutions.fluidity.test.premiershipapi.model.boostrapstatic.EventModel;
import solutions.fluidity.test.premiershipapi.model.clean.GameModel;
import solutions.fluidity.test.premiershipapi.model.clean.Team;
import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    BootstrapService bootstrapService;

    public List<GameModel> getMatches() throws IOException {
        List<GameModel> games = new ArrayList<>();
        Gson gson = new GsonBuilder().create();
        String bootstrap = bootstrapService.getBootstrapData();
        BootstrapStaticModel events = gson.fromJson(bootstrap, BootstrapStaticModel.class);
        var event = events.getEvents().get(0);
        var fixtures = event.getFixtures();
        for (FixtureModel fixtureModel : fixtures) {
            GameModel gameModel = new GameModel();
            gameModel.setHome(setTeams(fixtureModel, event, "HOME"));
            gameModel.setAway(setTeams(fixtureModel, event, "AWAY"));
            games.add(gameModel);
        }


        return games;
    }

    private static Team setTeams(FixtureModel fixtureModel, EventModel event, String adv) {
        Team team = new Team();
        if (adv.equals("HOME"))
            team.setTeam(fixtureModel.getTeams().getHomeTeam());
        else
            team.setTeam(fixtureModel.getTeams().getAwayTeam());
        var goalies = team.getTeam().getElements().stream().filter(e -> e.getElement_type() == 1).toList();
        team.setGoalKeepers(goalies);
        var defenders = team.getTeam().getElements().stream().filter(e -> e.getElement_type() == 2).toList();
        team.setDefenders(defenders);

        var mid = team.getTeam().getElements().stream().filter(e -> e.getElement_type() == 3).toList();
        team.setMidfielders(mid);

        var forwards = team.getTeam().getElements().stream().filter(e -> e.getElement_type() == 2).toList();
        team.setForwards(forwards);
        return team;
    }
}
