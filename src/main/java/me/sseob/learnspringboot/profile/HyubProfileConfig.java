package me.sseob.learnspringboot.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hyun")
public class HyubProfileConfig {
	
	@Bean
	public String hello() {
		return "hello hyun !";
	}
}
