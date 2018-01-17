package example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Di on 17/01/18.
 * Person
 *
 * @author Di
 */
@Getter
@Setter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
}
