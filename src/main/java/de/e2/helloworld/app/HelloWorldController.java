package de.e2.helloworld.app;

import java.util.Collections;
import java.util.Map;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import de.e2.helloworld.lib.Greeter;

@Controller
@Description("A controller for handling requests for hello messages")
public class HelloWorldController {
  final private Greeter greeter;

  public HelloWorldController(de.e2.helloworld.lib.Greeter greeter) {
    this.greeter = greeter;
  }

  @GetMapping("/{name}")
  @ResponseBody
  public Map<String, String> hello(@PathVariable("name") String name) {
    return Collections.singletonMap("message", greeter.greet(name));
  }

}
