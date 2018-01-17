package stepdefs;

import cucumber.api.java.en.When;
import example.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Di on 17/01/18.
 * person.feature step defs
 *
 * @author Di
 */
@Slf4j
public class NewPersonStepdefs {

    private Person person;

    public NewPersonStepdefs(Person person) {
        this.person = person;
    }

    @When("^Yaqi Li$")
    public void yaqiLi() {
        person.setFirstName("Yaqi");
        person.setLastName("Li");
        person.setAge(27);
        person.setGender("Female");

        log.info(person.toString());
    }
}
