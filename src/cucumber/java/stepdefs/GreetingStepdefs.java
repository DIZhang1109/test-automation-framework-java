package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import example.Greeting;
import lombok.extern.slf4j.Slf4j;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Di on 11/01/18.
 * greeting.feature step defs
 *
 * @author Di
 */
@Slf4j
public class GreetingStepdefs {

    @Given("^Say Hi$")
    public void sayHi() {
        Greeting greeting = new Greeting();
        greeting.sayHi();
        assertThat(greeting.hiOrNot(), is(true));
    }

    @Then("^Hi$")
    public void hi() {
        log.info("Hi Hi Hi");
    }
}
