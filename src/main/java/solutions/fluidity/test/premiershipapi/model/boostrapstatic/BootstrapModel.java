package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.ArrayList;
import java.util.List;

public class BootstrapModel {

    private List<EventModel> events;

    public List<EventModel> getEvents() {
        return events == null ? new ArrayList<>() : events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }
}