
package de.e2.helloworld.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.endpoint.MetricsEndpoint;
import org.springframework.boot.actuate.endpoint.MetricsEndpointMetricReader;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.MBeanExporter;

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
