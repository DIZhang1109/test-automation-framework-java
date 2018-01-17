package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import example.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Di on 17/01/18.
 * person.feature step defs
 *
 * @author Di
 */
@Slf4j
public class OldPersonStepdefs {

    private Person person;

    public OldPersonStepdefs(Person person) {
        this.person = person;
    }

    @Given("^Di Zhang$")
    public void diZhang() {
        person.setFirstName("Di");
        person.setLastName("Zhang");
        person.setAge(30);
        person.setGender("Male");

        log.info(person.toString());
    }

    @Then("^Yaqi Zhang$")
    public void yaqiZhang() {
        person.setLastName("Zhang");
        person.setAge(5);
        person.setGender("Unknown");

        log.info(person.toString());
    }
}
