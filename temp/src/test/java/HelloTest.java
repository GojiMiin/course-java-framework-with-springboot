import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.assertEquals;

public class HelloTest {
    @Test
    public void case01() {
        Hello hello = new Hello();
        String actualResult = hello.sayHi("Got");
        assertEquals("Hello, Got", actualResult);

    }
}
