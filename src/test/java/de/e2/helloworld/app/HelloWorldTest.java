package de.e2.helloworld.app;

import de.e2.helloworld.lib.Greeter;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {
    @Test
    public void helloMessage() {
        Greeter greeter = new Greeter();
        HelloWorldController controller=new HelloWorldController(greeter);

        java.util.Map<String, String> helloMessage = controller.hello("Rene");
        assertThat(helloMessage.keySet(), hasSize(1));
        assertThat(helloMessage.keySet(), contains("message"));
        assertThat(helloMessage.get("message"), containsString("Rene"));
    }
}
