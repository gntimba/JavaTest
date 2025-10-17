package solutions.fluidity.test.premiershipapi.model.clean;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import solutions.fluidity.test.premiershipapi.model.boostrapstatic.ElementModel;
import solutions.fluidity.test.premiershipapi.model.boostrapstatic.TeamModel;

import java.util.List;

@Data
@NoArgsConstructor
public class Team {
    TeamModel team;
    private List<ElementModel> goalKeepers;
    private List<ElementModel> forwards;
    private List<ElementModel> defenders;
    private  List<ElementModel> midfielders;
}
