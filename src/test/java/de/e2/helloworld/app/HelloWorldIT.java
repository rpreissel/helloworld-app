package de.e2.helloworld.app;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class HelloWorldIT {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    public void helloMessage() {
        Map<String, String> helloMessage = helloWorldController.hello("Rene");
        assertAll("message",
                () -> assertEquals(helloMessage.keySet().size(), 1),
                () -> assertTrue(helloMessage.keySet().contains("message")),
                () -> assertTrue(helloMessage.get("message").contains("Rene"))
        );
    }

}
