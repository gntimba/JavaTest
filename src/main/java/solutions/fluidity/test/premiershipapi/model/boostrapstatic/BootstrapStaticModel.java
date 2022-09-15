package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.ArrayList;
import java.util.List;

public class BootstrapStaticModel {

    private List<EventModel> events;
    private List<TeamModel> teams;
    private List<ElementModel> elements;
    private List<ElementTypeModel> element_types;

    public List<EventModel> getEvents() {
        return events == null ? new ArrayList<>() : events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }

    public List<TeamModel> getTeams() {
        return teams == null ? new ArrayList<>() : teams;
    }

    public void setTeams(List<TeamModel> teams) {
        this.teams = teams;
    }

    public List<ElementModel> getElements() {
        return elements == null ? new ArrayList<>() : elements;
    }

    public void setElements(List<ElementModel> elements) {
        this.elements = elements;
    }

    public List<ElementTypeModel> getElement_types() {
        return element_types == null ? new ArrayList<>() : element_types;
    }

    public void setElement_types(List<ElementTypeModel> element_types) {
        this.element_types = element_types;
    }
}
