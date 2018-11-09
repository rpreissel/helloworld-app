package de.e2.helloworld.app;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class HelloWorldIT {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    public void helloMessage() {
        Map<String, String> helloMessage = helloWorldController.hello("Rene");
        assertThat(helloMessage.keySet(), hasSize(1));
        assertThat(helloMessage.keySet(), contains("message"));
        assertThat(helloMessage.get("message"), containsString("Rene"));
    }

}
