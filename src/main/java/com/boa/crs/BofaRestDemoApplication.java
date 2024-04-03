package com.boa.crs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.boa.crs.*")
public class BofaRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BofaRestDemoApplication.class, args);
	}

}
