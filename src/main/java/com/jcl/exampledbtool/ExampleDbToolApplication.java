package com.jcl.exampledbtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ExampleDbToolApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ExampleDbToolApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        ConfigurableApplicationContext context = app.run(args);
        // Flyway already ran during context startup. Exit so this is a one-shot CLI.
        int exitCode = SpringApplication.exit(context, () -> 0);
        System.exit(exitCode);
    }

}
