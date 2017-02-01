
package de.e2.helloworld.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import de.e2.helloworld.lib.Greeter;

@SpringBootApplication
public class HelloWorldApplication {

  @Bean
  public Greeter greeter() {
    return new Greeter();
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(HelloWorldApplication.class, args);
  }

}
