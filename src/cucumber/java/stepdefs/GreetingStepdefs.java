package stepdefs;

import cucumber.api.java.en.Given;
import example.Greeting;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Di on 11/01/18.
 * greeting.feature step defs
 *
 * @author Di
 */
public class GreetingStepdefs {

    @Given("^Say Hi$")
    public void sayHi() throws Throwable {
        Greeting greeting = new Greeting();
        greeting.sayHi();
        assertThat(greeting.hiOrNot(), is(true));
    }
}
