package solutions.fluidity.test.premiershipapi.model.fixtures;

import solutions.fluidity.test.premiershipapi.model.boostrapstatic.TeamsModel;

public class FixtureModel {
    private String code;
    private Long event;
    private Boolean finished;
    private Boolean finished_provisional;
    private Long id;
    private String kickoff_time;
    private Long minutes;
    private Boolean provisional_start_time;
    private Boolean started;
    private Long team_a;
    private Long team_a_score;
    private Long team_h;
    private Long team_h_score;
//    private stats: List<StatsModel> = mutableListOf()
    private Long team_h_difficulty;
    private Long team_a_difficulty;
    private Long pulse_id;
    private TeamsModel teams;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getEvent() {
        return event;
    }

    public void setEvent(Long event) {
        this.event = event;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getFinished_provisional() {
        return finished_provisional;
    }

    public void setFinished_provisional(Boolean finished_provisional) {
        this.finished_provisional = finished_provisional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKickoff_time() {
        return kickoff_time;
    }

    public void setKickoff_time(String kickoff_time) {
        this.kickoff_time = kickoff_time;
    }

    public Long getMinutes() {
        return minutes;
    }

    public void setMinutes(Long minutes) {
        this.minutes = minutes;
    }

    public Boolean getProvisional_start_time() {
        return provisional_start_time;
    }

    public void setProvisional_start_time(Boolean provisional_start_time) {
        this.provisional_start_time = provisional_start_time;
    }

    public Boolean getStarted() {
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    public Long getTeam_a() {
        return team_a;
    }

    public void setTeam_a(Long team_a) {
        this.team_a = team_a;
    }

    public Long getTeam_a_score() {
        return team_a_score;
    }

    public void setTeam_a_score(Long team_a_score) {
        this.team_a_score = team_a_score;
    }

    public Long getTeam_h() {
        return team_h;
    }

    public void setTeam_h(Long team_h) {
        this.team_h = team_h;
    }

    public Long getTeam_h_score() {
        return team_h_score;
    }

    public void setTeam_h_score(Long team_h_score) {
        this.team_h_score = team_h_score;
    }

    public Long getTeam_h_difficulty() {
        return team_h_difficulty;
    }

    public void setTeam_h_difficulty(Long team_h_difficulty) {
        this.team_h_difficulty = team_h_difficulty;
    }

    public Long getTeam_a_difficulty() {
        return team_a_difficulty;
    }

    public void setTeam_a_difficulty(Long team_a_difficulty) {
        this.team_a_difficulty = team_a_difficulty;
    }

    public Long getPulse_id() {
        return pulse_id;
    }

    public void setPulse_id(Long pulse_id) {
        this.pulse_id = pulse_id;
    }

    public TeamsModel getTeams() {
        return teams;
    }

    public void setTeams(TeamsModel teams) {
        this.teams = teams;
    }
}


