package me.sseob.learnspringboot.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("sseob")
public class SeobProfileConfig {
	
	@Bean
	public String hello() {
		return "hello sseob !";
	}
}
