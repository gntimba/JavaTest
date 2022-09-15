package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

public class TeamsModel {
    private TeamModel homeTeam;
    private TeamModel awayTeam;

    public TeamModel getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(TeamModel homeTeam) {
        this.homeTeam = homeTeam;
    }

    public TeamModel getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(TeamModel awayTeam) {
        this.awayTeam = awayTeam;
    }
}