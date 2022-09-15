package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.ArrayList;
import java.util.List;

public class TeamModel {
    private Long code;
    private Long id;
    private String name;
    private String short_name;
    private String unavailable;
    private List<ElementModel> elements;


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

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

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(String unavailable) {
        this.unavailable = unavailable;
    }

    public List<ElementModel> getElements() {
        return elements == null ? new ArrayList<>() : elements;
    }

    public void setElements(List<ElementModel> elements) {
        this.elements = elements;
    }
}