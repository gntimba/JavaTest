package solutions.fluidity.test.service;

import org.springframework.stereotype.Component;
import solutions.fluidity.test.premiershipapi.Fixtures;
import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;

import java.io.IOException;
import java.util.List;

@Component
public class FixturesService {
    private Fixtures fixtures;

    public FixturesService(Fixtures fixtures) {
        this.fixtures = fixtures;
    }

    public String getFixtures() throws IOException {
        String result = fixtures.fixturesLookup();
        return result;
    }

    public List<FixtureModel> parseResponse(String responseBody)  {
        List<FixtureModel> fixtures  = this.fixtures.parseResponse(responseBody);
        return fixtures;
    }
}