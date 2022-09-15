package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

class PhaseModel {
    private Long id;
    private String name;
    private Long start_event;
    private Long stop_event;

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

    public Long getStart_event() {
        return start_event;
    }

    public void setStart_event(Long start_event) {
        this.start_event = start_event;
    }

    public Long getStop_event() {
        return stop_event;
    }

    public void setStop_event(Long stop_event) {
        this.stop_event = stop_event;
    }
}