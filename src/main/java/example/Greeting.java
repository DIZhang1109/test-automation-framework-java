package example;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Di on 11/01/18.
 * Example class
 *
 * @author Di
 */
@Slf4j
public class Greeting {

    public void sayHi() {
        log.info("Hello Di Zhang");
    }

    public boolean hiOrNot() {
        return true;
    }
}
