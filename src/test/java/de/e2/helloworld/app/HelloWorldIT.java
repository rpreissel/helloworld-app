package de.e2.helloworld.app;

import java.util.Map;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@DirtiesContext
public class HelloWorldIT {

  @Autowired
  private HelloWorldController helloWorldController;

  @Test
  public void helloMessage() {
    Map<String, String> helloMessage = helloWorldController.hello("Rene");
    Assert.assertThat(helloMessage.keySet(), Matchers.hasSize(1));
    Assert.assertThat(helloMessage.keySet(), Matchers.contains("message"));
    Assert.assertThat(helloMessage.get("message"), Matchers.containsString("Rene"));
  }

}
