package de.e2.helloworld.app;

import de.e2.helloworld.lib.Greeter;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldTest {
    @Test
    public void helloMessage() {
        Greeter greeter = new Greeter();
        HelloWorldController controller = new HelloWorldController(greeter);

        Map<String, String> helloMessage = controller.hello("Rene");
        assertAll("message",
                () -> assertEquals(helloMessage.keySet().size(), 1),
                () -> assertTrue(helloMessage.keySet().contains("message")),
                () -> assertTrue(helloMessage.get("message").contains("Rene"))
        );
    }
}
