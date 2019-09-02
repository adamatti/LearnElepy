package adamatti;

import com.elepy.annotations.Identifier;
import com.elepy.annotations.Required;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Unique;

@RestModel(name = "States", slug = "/states")
public class State {
    @Identifier
    private String stateId;

    @Required
    @Unique
    private String name;

    private Country country;

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
