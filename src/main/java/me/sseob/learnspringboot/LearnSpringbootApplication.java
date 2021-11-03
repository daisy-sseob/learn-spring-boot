package me.sseob.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(LearnSpringbootApplication.class);
		app.addListeners(new SampleListener());
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}
}
