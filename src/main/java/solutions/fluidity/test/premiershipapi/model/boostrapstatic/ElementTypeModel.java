package solutions.fluidity.test.premiershipapi.model.boostrapstatic;

import java.util.ArrayList;
import java.util.List;

public class ElementTypeModel {
    private Long id;
    private String plural_name;
    private String plural_name_short;
    private String singular_name;
    private String singular_name_short;
    private Long squad_select;
    private Long squad_min_play;
    private Long squad_max_play;
    private String ui_shirt_specific;
    private List<Long> sub_positions_locked;
    private Long element_count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlural_name() {
        return plural_name;
    }

    public void setPlural_name(String plural_name) {
        this.plural_name = plural_name;
    }

    public String getPlural_name_short() {
        return plural_name_short;
    }

    public void setPlural_name_short(String plural_name_short) {
        this.plural_name_short = plural_name_short;
    }

    public String getSingular_name() {
        return singular_name;
    }

    public void setSingular_name(String singular_name) {
        this.singular_name = singular_name;
    }

    public String getSingular_name_short() {
        return singular_name_short;
    }

    public void setSingular_name_short(String singular_name_short) {
        this.singular_name_short = singular_name_short;
    }

    public Long getSquad_select() {
        return squad_select;
    }

    public void setSquad_select(Long squad_select) {
        this.squad_select = squad_select;
    }

    public Long getSquad_min_play() {
        return squad_min_play;
    }

    public void setSquad_min_play(Long squad_min_play) {
        this.squad_min_play = squad_min_play;
    }

    public Long getSquad_max_play() {
        return squad_max_play;
    }

    public void setSquad_max_play(Long squad_max_play) {
        this.squad_max_play = squad_max_play;
    }

    public String getUi_shirt_specific() {
        return ui_shirt_specific;
    }

    public void setUi_shirt_specific(String ui_shirt_specific) {
        this.ui_shirt_specific = ui_shirt_specific;
    }

    public List<Long> getSub_positions_locked() {
        return sub_positions_locked == null ? new ArrayList<>() : sub_positions_locked;
    }

    public void setSub_positions_locked(List<Long> sub_positions_locked) {
        this.sub_positions_locked = sub_positions_locked;
    }

    public Long getElement_count() {
        return element_count;
    }

    public void setElement_count(Long element_count) {
        this.element_count = element_count;
    }
}