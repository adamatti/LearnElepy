package adamatti;

import com.elepy.annotations.Identifier;
import com.elepy.annotations.Required;
import com.elepy.annotations.RestModel;
import com.elepy.annotations.Text;
import com.elepy.annotations.Unique;
import com.elepy.models.TextType;

import java.util.List;

@RestModel(name = "Countries", slug = "/countries")
public class Country {
    @Identifier
    private String countryId;

    @Required
    @Unique
    private String name;

    @Text(value = TextType.TEXTAREA, maximumLength = 100)
    private String shortDescription;

    //private List<State> states;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
/*
    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
 */
}
