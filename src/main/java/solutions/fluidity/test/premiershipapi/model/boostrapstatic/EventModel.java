package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import solutions.fluidity.test.premiershipapi.model.fixtures.FixtureModel;

import java.util.ArrayList;
import java.util.List;

public class EventModel {
    private Long id;
    private String name;
    private String deadline_time;
    private String average_entry_score;
    private Boolean finished;
    private String data_checked;
    private String highest_scoring_entry;
    private Long deadline_time_epoch;
    private String deadline_time_game_offset;
    private String highest_score;
    private String is_previous;
    private Boolean is_current;
    private String is_next;
    private List<FixtureModel> fixtures;
    private List<ElementModel> goalKeepers;
    private List<ElementModel> forwards;
    private List<ElementModel> defenders;
    private  List<ElementModel> midfielders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline_time() {
        return deadline_time;
    }

    public void setDeadline_time(String deadline_time) {
        this.deadline_time = deadline_time;
    }

    public String getAverage_entry_score() {
        return average_entry_score;
    }

    public void setAverage_entry_score(String average_entry_score) {
        this.average_entry_score = average_entry_score;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getData_checked() {
        return data_checked;
    }

    public void setData_checked(String data_checked) {
        this.data_checked = data_checked;
    }

    public String getHighest_scoring_entry() {
        return highest_scoring_entry;
    }

    public void setHighest_scoring_entry(String highest_scoring_entry) {
        this.highest_scoring_entry = highest_scoring_entry;
    }

    public Long getDeadline_time_epoch() {
        return deadline_time_epoch;
    }

    public void setDeadline_time_epoch(Long deadline_time_epoch) {
        this.deadline_time_epoch = deadline_time_epoch;
    }

    public String getDeadline_time_game_offset() {
        return deadline_time_game_offset;
    }

    public void setDeadline_time_game_offset(String deadline_time_game_offset) {
        this.deadline_time_game_offset = deadline_time_game_offset;
    }

    public String getHighest_score() {
        return highest_score;
    }

    public void setHighest_score(String highest_score) {
        this.highest_score = highest_score;
    }

    public String getIs_previous() {
        return is_previous;
    }

    public void setIs_previous(String is_previous) {
        this.is_previous = is_previous;
    }

    public Boolean getIs_current() {
        return is_current;
    }

    public void setIs_current(Boolean is_current) {
        this.is_current = is_current;
    }

    public String getIs_next() {
        return is_next;
    }

    public void setIs_next(String is_next) {
        this.is_next = is_next;
    }

    public List<FixtureModel> getFixtures() {
        return fixtures;
    }

    public void setFixtures(List<FixtureModel> fixtures) {
        this.fixtures = fixtures;
    }

    public List<ElementModel> getGoalKeepers() {
        return goalKeepers == null ? new ArrayList<>() : goalKeepers;
    }

    public void setGoalKeepers(List<ElementModel> goalKeepers) {
        this.goalKeepers = goalKeepers;
    }

    public List<ElementModel> getForwards() {
        return forwards == null ? new ArrayList<>() : forwards;
    }

    public void setForwards(List<ElementModel> forwards) {
        this.forwards = forwards;
    }

    public List<ElementModel> getDefenders() {
        return defenders == null ? new ArrayList<>() : defenders;
    }

    public void setDefenders(List<ElementModel> defenders) {
        this.defenders = defenders;
    }

    public List<ElementModel> getMidfielders() {
        return midfielders == null ? new ArrayList<>() : midfielders;
    }

    public void setMidfielders(List<ElementModel> midfielders) {
        this.midfielders = midfielders;
    }
}